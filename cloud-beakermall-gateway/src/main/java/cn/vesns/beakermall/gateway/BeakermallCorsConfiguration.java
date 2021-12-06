package cn.vesns.beakermall.gateway;/**
 * @version :JDK1.8
 * @date : 2021-12-07 1:37
 * @author : vip865047755@126.com
 * @File : BeakermallCorsConfiguration.java
 * @software: IntelliJ IDEA
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author: vesns vip865047755@126.com
 * @Title: CorsConfiguration
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-07 1:37
 */
@Configuration
public class BeakermallCorsConfiguration {
    /**
     * 非一般请求会先发送optional请求进行跨域试探
     * 利用过滤器对其回应允许跨域
     * @return
     */
    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();

        // corsConfiguration 处理策略
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 注意这里调用的是add方法
        // 允许所有请求头
        corsConfiguration.addAllowedHeader("*");
        // 允许所有来源
        corsConfiguration.addAllowedOrigin("*");
        // 允许所有请求方法
        corsConfiguration.addAllowedMethod("*");
        // 允许携带coolie
        corsConfiguration.setAllowCredentials(true);

        // path 要对哪些请求进行跨域处理；corsConfiguration 处理策略
        configurationSource.registerCorsConfiguration("/**", corsConfiguration);

        // 创建过滤器
        return new CorsWebFilter(configurationSource);
    }
}
