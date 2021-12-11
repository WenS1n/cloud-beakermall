package cn.vesns.beakermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-09 17:29:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

