package cn.vesns.member;/**
 * @version :JDK1.8
 * @date : 2021-12-06 1:03
 * @author : vip865047755@126.com
 * @File : MemberApplication.java
 * @software: IntelliJ IDEA
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: vesns vip865047755@126.com
 * @Title: MemberApplication
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-06 1:03
 */
@EnableFeignClients(basePackages = "cn.vesns.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
