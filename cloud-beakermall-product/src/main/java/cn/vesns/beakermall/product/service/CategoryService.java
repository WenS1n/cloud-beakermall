package cn.vesns.beakermall.product.service;

import cn.vesns.beakermall.product.entity.CategoryEntity;
import cn.vesns.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-08 19:54:24
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelog完整路径
     * @param attrGroupId1
     * @return
     */
    Long[] findCatelogPath(Long attrGroupId1);

}

