package cn.vesns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author: vesns vip865047755@126.com
 * @Title: ProductApplication
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-06 1:09
 */


@EnableDiscoveryClient
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
