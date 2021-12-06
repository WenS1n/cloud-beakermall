package cn.vesns.beakermall.gateway;/**
 * @version :JDK1.8
 * @date : 2021-12-06 20:32
 * @author : vip865047755@126.com
 * @File : GetewayApplicaion.java
 * @software: IntelliJ IDEA
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: vesns vip865047755@126.com
 * @Title: GetewayApplicaion
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-06 20:32
 * 开启服务注册发现
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
