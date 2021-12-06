package cn.vesns.beakermall.product.service.impl;

import cn.vesns.beakermall.product.dao.BrandDao;
import cn.vesns.beakermall.product.dao.CategoryBrandRelationDao;
import cn.vesns.beakermall.product.entity.BrandEntity;
import cn.vesns.beakermall.product.service.BrandService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.common.utils.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {


    @Autowired
    private CategoryBrandRelationDao categoryBrandRelationDao;



}