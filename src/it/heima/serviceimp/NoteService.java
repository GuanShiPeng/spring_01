package it.heima.serviceimp;

import it.heima.daoimp.NoteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GuanShiPeng on 2017/7/28 15:48.
 */
//@Service   //声明此类交给spring管理
//@Scope(value = "prototype")    //生成此类使用单例还是多例
public class NoteService
{

    /*@Autowired () 注入bean  默认是按类型注入，如果一个容器中有两个对象，会把属性作为id取查询，查询不到则报错
    @Qualifier(value = "notedao") 根据指定的beanid取查找*/

    //jdk注入方式没有name按照类型注入反之则id注入1
    //@Resource(name = "notedao")
    private NoteDao noteDao;

    public void save()
    {
        System.out.println("service保存");
        noteDao.save();
    }

    public void delete()
    {
        System.out.println("service删除");
        noteDao.delete();
    }

    public void update()
    {
        System.out.println("service更新");
        noteDao.update();
    }

    public void find()
    {
        System.out.println("service查询一个");
        noteDao.find();
    }

    public void findAll()
    {
        System.out.println("service查询所有");
        noteDao.findAll();
    }
}
