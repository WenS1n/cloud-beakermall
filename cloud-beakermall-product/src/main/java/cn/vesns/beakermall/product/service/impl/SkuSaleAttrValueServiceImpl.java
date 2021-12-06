package cn.vesns.beakermall.product.service.impl;

import cn.vesns.beakermall.product.dao.SkuSaleAttrValueDao;
import cn.vesns.beakermall.product.entity.SkuSaleAttrValueEntity;
import cn.vesns.beakermall.product.service.SkuSaleAttrValueService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.common.utils.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity> implements SkuSaleAttrValueService {




    @Override
    public List<String> stringListBySkuId(Long skuId) {
        return this.baseMapper.stringListBySkuId(skuId);
    }

}