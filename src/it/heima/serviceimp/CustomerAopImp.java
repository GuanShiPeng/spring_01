package it.heima.serviceimp;

import it.heima.service.CustomerAop;
import org.springframework.stereotype.Service;

/**
 * Created by GuanShiPeng on 2017/7/29 15:05.
 */
@Service
public class CustomerAopImp implements CustomerAop
{
    @Override
    public void save()
    {
        System.out.println("保存");
    }

    @Override
    public int delete()
    {
        System.out.println("删除");
        return 100;

    }

    @Override
    public int update()
    {
        System.out.println("更新");
        return 200;
    }

    @Override
    public Integer find()
    {
        System.out.println("查询");
        int i = 1/0;

        return 100;
    }

    @Override
    public int  findAll()
    {
        System.out.println("查询所有");
        return 321;

    }
}
