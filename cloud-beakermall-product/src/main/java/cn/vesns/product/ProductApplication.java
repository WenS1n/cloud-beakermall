package cn.vesns.product;/**
 * @version :JDK1.8
 * @date : 2021-12-06 1:09
 * @author : vip865047755@126.com
 * @File : ProductApplication.java
 * @software: IntelliJ IDEA
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: vesns vip865047755@126.com
 * @Title: ProductApplication
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-06 1:09
 */

@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
