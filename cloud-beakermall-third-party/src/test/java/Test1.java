import cn.vesns.beakermall.PartyApplication;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;

/**
 * @author: vesns vip865047755@126.com
 * @Title: Test1
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-10 22:02
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PartyApplication.class)
public class Test1 {

    @Autowired
    OSSClient ossClient;

    @Test
    public void test2() {
        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
//        String endpoint = "oss-cn-chengdu.aliyuncs.com";
//// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//// 填写Bucket名称，例如examplebucket。
//        String bucketName = "cloud-beakermall";
// 填写文件名。文件名包含路径，不包含Bucket名称。例如exampledir/exampleobject.txt。
        String objectName = "C:\\Users\\86504\\Desktop\\ProfilePhoto.jpg";


        try {
            // 创建OSSClient实例。
//            ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

            String content = "Hello OSS";
            ossClient.putObject("cloud-beakermall", "ProfilePhoto.jpg", new ByteArrayInputStream(content.getBytes()));
        } catch (OSSException e) {
            e.printStackTrace();
        } finally {
            // 关闭OSSClient。
            ossClient.shutdown();
            System.out.println("上传完成");
        }
    }
}
