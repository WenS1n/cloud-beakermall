package cn.vesns.beakermall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * ?????˻????
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-06 19:13:34
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

