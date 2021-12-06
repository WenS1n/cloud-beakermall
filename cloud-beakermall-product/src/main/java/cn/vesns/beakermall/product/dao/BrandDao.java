package cn.vesns.beakermall.product.dao;

import cn.vesns.beakermall.product.entity.BrandEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 品牌
 * 
 * @author wanwgei
 * @email i@weiwang.com
 * @date 2020-09-13 10:48:45
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {


}
