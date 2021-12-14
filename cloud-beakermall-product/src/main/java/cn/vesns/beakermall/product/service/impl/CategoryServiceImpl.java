package cn.vesns.beakermall.product.service.impl;

import cn.vesns.beakermall.product.dao.CategoryDao;
import cn.vesns.beakermall.product.entity.CategoryEntity;
import cn.vesns.beakermall.product.service.CategoryService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.common.utils.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> list = baseMapper.selectList(null);
        // 组装成父子树形结构
        // 找到所有一级分类
        return list.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek(menu-> menu.setChildren(getChildrens(menu,list))).sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1.检查当前删除的菜单，是否配别的地方引用

        // 逻辑删除
        baseMapper.deleteBatchIds(asList);


    }

    @Override
    public Long[] findCatelogPath(Long attrGroupId1) {
        List<Long> paths = new ArrayList<>();
        List<Long> parents = findParents(attrGroupId1, paths);
        Collections.reverse(parents);
        return parents.toArray(new Long[parents.size()]);
    }

    private List<Long> findParents(Long categoryId,List<Long> paths){
        paths.add(categoryId);
        CategoryEntity byId = this.getById(categoryId);
        if (byId.getParentCid() != 0) {
            findParents(byId.getParentCid(),paths);
        }
        return paths;
    }

    /**
     * 递归查找所有菜单的子菜单
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all) {

//        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
//                .peek(categoryEntity -> categoryEntity.setChildren(getChildrens(categoryEntity,all)))
//                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
//                .collect(Collectors.toList());
        return all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

    }

}