package cn.vesns.beakermall.product.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: vesns vip865047755@126.com
 * @Title: MybatisConfig
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-14 21:56
 */
@SpringBootConfiguration
@EnableTransactionManagement
@MapperScan("cn.vesns.beakermall.product.dao")
public class MybatisConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setOverflow(true);
        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }

}
