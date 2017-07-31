package it.heima.controller;

import it.heima.serviceimp.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by GuanShiPeng on 2017/7/31 20:50.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:accountContext.xml")
public class AccountWeb
{
    @Autowired
    AccountService accountService;
    @Test
    public void t(){
        accountService.account();
    }
}
