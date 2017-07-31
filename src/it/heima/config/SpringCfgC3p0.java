package it.heima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by GuanShiPeng on 2017/7/28 19:55.
 */

@Configuration
public class SpringCfgC3p0
{



    @Bean(name = "dateSource")  //方法的返回值
    public DataSource createDateSource()
    {
        ComboPooledDataSource cd = new ComboPooledDataSource();
        try
        {
            cd.setDriverClass("com.mysql.jdbc.Driver");
            cd.setJdbcUrl("jdbc:mysql:///hibernate01_62");
            cd.setUser("root");
            cd.setPassword("root");
        } catch (PropertyVetoException e)
        {
            e.printStackTrace();
        }

        return cd;
    }
}
