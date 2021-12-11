package cn.vesns.beakermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-09 17:29:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

