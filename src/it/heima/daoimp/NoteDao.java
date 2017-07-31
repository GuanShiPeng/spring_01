package it.heima.daoimp;


import org.springframework.stereotype.Repository;

/**
 * Created by GuanShiPeng on 2017/7/28 15:49.
 */
@Repository(value = "notedao")
public class NoteDao
{
    public void save()
    {
        System.out.println("dao保存");
    }

    public void delete()
    {
        System.out.println("dao删除");
    }

    public void update()
    {
        System.out.println("dao更新");
    }

    public void find()
    {
        System.out.println("dao查询");
    }

    public void findAll()
    {
        System.out.println("dao查询所有");
    }
}
