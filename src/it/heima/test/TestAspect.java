package it.heima.test;

import it.heima.service.CustomerAop;
import it.heima.serviceimp.CustomerAopImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by GuanShiPeng on 2017/7/29 15:20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aopconfigNote.xml")
public class TestAspect
{
    @Autowired
    //用被代理类的接口接收
    private CustomerAop customerAopImp;

    @Test
    public void t1()
    {
       // System.out.println(customerAopImp);
//        customerAopImp.save();
//        int delete = customerAopImp.delete();
//        System.out.println(delete);

//        int all = customerAopImp.findAll();
//        System.out.println(all);

//        int update = customerAopImp.update();
//        System.out.println(update);
        customerAopImp.findAll();

    }
}
