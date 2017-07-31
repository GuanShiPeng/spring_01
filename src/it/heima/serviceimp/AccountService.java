package it.heima.serviceimp;

import it.heima.daoimp.AccountDao;
import it.heima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by GuanShiPeng on 2017/7/31 17:51.
 */

//@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,timeout = -1,readOnly = false)
public class AccountService
{
    @Autowired
    AccountDao accountDao;

    @Test
    public void t()
    {
        accountDao.save();
    }

    @Test

    public void account()
    {
        accountDao.update1();
        accountDao.update2();
    }
}
