package cn.vesns.beakermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-09 17:29:03
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
}

