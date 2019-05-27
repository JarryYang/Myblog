import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import wang.dreamland.www.dao.UserContentMapper;
import wang.dreamland.www.entity.UserContent;
import wang.dreamland.www.service.UserContentService;

import java.io.IOException;
import java.util.List;

/**
 * Created by 12903 on 2018/6/21.
 */
@ContextConfiguration(locations = {"classpath:applicationContext-solr.xml"})
public class TestSolrJ extends AbstractJUnit4SpringContextTests {
    @Autowired
    private SolrClient solrServer;

    @Test
    public void testSave() throws Exception {

        //1.创建一个文档对象
        SolrInputDocument inputDocument = new SolrInputDocument();
        inputDocument.addField( "id", "32" );
        inputDocument.addField( "item_title", "ssm项目开发实战" );
        inputDocument.addField( "item_image", "www.ssm.png" );
        inputDocument.addField( "author", "wly" );
        //2.将文档写入索引库中
        solrServer.add( inputDocument );
        //3.提交
        solrServer.commit();
    }
}