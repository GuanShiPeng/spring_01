package it.heima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import it.heima.config.SpringCfgC3p0;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by GuanShiPeng on 2017/7/28 19:19.
 */
public class Demo_c3p0
{
    @Test
    public void t1() throws SQLException
    {
        //通过配置文件获取c3p0,得到连接
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext_C3P0.xml");
        ComboPooledDataSource dateSourcedate = (ComboPooledDataSource) cp.getBean("dateSource");
        Connection connection = dateSourcedate.getConnection();
        System.out.println(connection);
    }

    @Test
    public void t2() throws SQLException
    {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(SpringCfgC3p0.class);
        DataSource dateSource = (DataSource) anno.getBean("dateSource");
        System.out.println(dateSource.getConnection());
    }
}
