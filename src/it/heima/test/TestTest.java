package it.heima.test;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import it.heima.daoimp.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by GuanShiPeng on 2017/7/28 22:30.
 */

//使用spring方式测试
@RunWith(value = SpringJUnit4ClassRunner.class)
//加载配置文件
@ContextConfiguration("classpath:aopconfigNote.xml")
public class TestTest
{
    //注入参数
    @Autowired
    private TestDao testDao;

    //测试方法
    @Test
    public void save(){
        testDao.save();
    }
}
