package cn.vesns.member.feign;

import cn.vesns.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : vip865047755@126.com
 * @version :JDK1.8
 * @date : 2021-08-12 10:34
 * @File : CouponFeignService.java
 * @software: IntelliJ IDEA
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
