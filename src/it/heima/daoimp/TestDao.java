package it.heima.daoimp;

import org.springframework.stereotype.Repository;

/**
 * Created by GuanShiPeng on 2017/7/28 22:42.
 */
@Repository
public class TestDao
{
    public void save()
    {
        System.out.println("保存");
    }

    public void delete()
    {
        System.out.println("删除");
    }
}
