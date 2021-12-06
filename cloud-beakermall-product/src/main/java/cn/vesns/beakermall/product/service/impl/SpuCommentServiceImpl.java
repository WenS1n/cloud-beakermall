package cn.vesns.beakermall.product.service.impl;

import cn.vesns.beakermall.product.dao.SpuCommentDao;
import cn.vesns.beakermall.product.entity.SpuCommentEntity;
import cn.vesns.beakermall.product.service.SpuCommentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

import java.util.Map;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {


}