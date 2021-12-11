package cn.vesns.beakermall.product.dao;

import cn.vesns.beakermall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-09 17:29:02
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
