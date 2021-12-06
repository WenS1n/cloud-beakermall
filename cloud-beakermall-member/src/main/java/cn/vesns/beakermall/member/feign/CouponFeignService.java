package cn.vesns.beakermall.member.feign;/**
 * @version :JDK1.8
 * @date : 2021-12-06 19:40
 * @author : vip865047755@126.com
 * @File : CouponFeignService.java
 * @software: IntelliJ IDEA
 */

import cn.vesns.common.utils.R;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: vesns vip865047755@126.com
 * @Title: CouponFeignService
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-06 19:40
 * feign
 * 远程调用，每一个方法都是调用的请求
 * 声明式远程调用
 */

@FeignClient("beakermall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
