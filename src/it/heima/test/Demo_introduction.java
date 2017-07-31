package it.heima.test;

import it.heima.domain.Text_demo_01;
import it.heima.domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by GuanShiPeng on 2017/7/26 15:29.
 */
public class Demo_introduction
{
    @Test
    public void t()
    {
        //从类路径下加载配置文件
        ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)spring.getBean("user_01");
        User user1 = (User)spring.getBean("user_03");
        System.out.println(user.getCustomer()==user1.getCustomer());
        System.out.println(user);
        System.out.println(user1);

        Text_demo_01 test = (Text_demo_01)spring.getBean("test");
        System.out.println(test.toString());
    }
}
