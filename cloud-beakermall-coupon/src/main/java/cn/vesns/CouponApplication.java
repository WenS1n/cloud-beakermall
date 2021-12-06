package cn.vesns;/**
 * @version :JDK1.8
 * @date : 2021-12-06 0:41
 * @author : vip865047755@126.com
 * @File : CouponApplication.java
 * @software: IntelliJ IDEA
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: vesns vip865047755@126.com
 * @Title: CouponApplication
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-06 0:41
 *
 * nacos作为配置中心统一管理
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }
}
