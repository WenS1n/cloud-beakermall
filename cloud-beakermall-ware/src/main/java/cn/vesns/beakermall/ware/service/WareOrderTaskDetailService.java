package cn.vesns.beakermall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * ???湤?
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-06 19:18:27
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

