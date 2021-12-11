package cn.vesns.beakermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-09 17:29:02
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

