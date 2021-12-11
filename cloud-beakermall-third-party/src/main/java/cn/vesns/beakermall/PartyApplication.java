package cn.vesns.beakermall;/**
 * @version :JDK1.8
 * @date : 2021-12-10 18:15
 * @author : vip865047755@126.com
 * @File : PartyApplication.java
 * @software: IntelliJ IDEA
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: vesns vip865047755@126.com
 * @Title: PartyApplication
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-10 18:15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(PartyApplication.class, args);
    }
}
