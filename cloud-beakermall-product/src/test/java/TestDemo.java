/**
 * @version :JDK1.8
 * @date : 2021-12-08 0:54
 * @author : vip865047755@126.com
 * @File : TestDemo.java
 * @software: IntelliJ IDEA
 */

import cn.vesns.ProductApplication;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;

/**
 * @author: vesns vip865047755@126.com
 * @Title: Test
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-08 0:54
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductApplication.class)
public class TestDemo {



    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println(11);
        }
    }


}
