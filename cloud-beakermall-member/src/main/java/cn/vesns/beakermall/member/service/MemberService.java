package cn.vesns.beakermall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.beakermall.member.entity.MemberEntity;

import java.util.Map;

/**
 * ??Ա
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-06 18:02:27
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

