package cn.vesns.beakermall.product.service;

import cn.vesns.beakermall.product.entity.SkuSaleAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wanwgei
 * @email i@weiwang.com
 * @date 2020-09-13 10:48:46
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {



    /**
     * 指定sku的所有销售属性及其值(属性名:值)
     * @param skuId
     * @return
     */
    List<String> stringListBySkuId(Long skuId);
}

