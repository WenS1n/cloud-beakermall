import cn.vesns.beakermall.search.SearchApplication;
import cn.vesns.beakermall.search.confgi.BeakerMallElasticSearchConfig;
import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @author: vesns vip865047755@126.com
 * @Title: SearchTest
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-13 23:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SearchApplication.class)
public class SearchTest {


    @Autowired
    RestHighLevelClient restHighLevelClient;

    /**
     * 存储数据
     *
     */
    @Test
    public void test () throws IOException {
        IndexRequest request = new IndexRequest("users");
        request.id("1");
//        request.source("username","zhangsan","age",18,"sex","男");
        User user = new User();
        user.setUsername("zhangsan");
        user.setSex("男");
        user.setAge(20);
        String s = JSON.toJSONString(user);
        // 存json
        request.source(s, XContentType.JSON);
        // 执行保存操作
        IndexResponse index = restHighLevelClient.index(request, BeakerMallElasticSearchConfig.COMMON_OPTIONS);

        // 提取
        System.out.println(index);
    }

    @Test
    public void searchData() throws IOException {
        //创建索引请求
        SearchRequest searchRequest = new SearchRequest();
        // 指定索引
        searchRequest.indices("bank");
//        指定dsl。检索条件
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.matchQuery("address","mill"));
        System.out.println(sourceBuilder.toString());

        searchRequest.source(sourceBuilder);

        // 执行搜索
        SearchResponse search = restHighLevelClient.search(searchRequest, BeakerMallElasticSearchConfig.COMMON_OPTIONS);

        // 分析结果
        System.out.println(search.toString());

    }


    @Data
    class User {
        private String username;
        private Integer age;
        private String sex;
    }
}
