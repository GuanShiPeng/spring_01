package it.heima.daoimp;

import it.heima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by GuanShiPeng on 2017/7/31 15:27.
 */

public class AccountDao extends JdbcDaoSupport
{
    /**
     * 保存
     */
    @Test
    public void save()
    {
        int i = getJdbcTemplate().update("INSERT INTO account VALUES(NULL,?,?)", "ooo", "123");
    }

    /**
     * 更新
     */
    @Test
    public void update1()
    {
        int zzz = getJdbcTemplate().update("UPDATE account SET NAME =?,money=money+? WHERE id =?", "zzz", "100", 1);
        System.out.println(zzz);
    }

    @Test
    public void update2()
    {
        //int i = 1/0;
        int zzz = getJdbcTemplate().update("UPDATE account SET NAME =?,money=money-? WHERE id =?", "ros", "100", 2);
        System.out.println(zzz);
    }

    /**
     * 删除
     */
    @Test
    public void delete()
    {
        int i = getJdbcTemplate().update("DELETE FROM account WHERE id = ?", "3");
        System.out.println(i);
    }

    /**
     * 查询一个
     */
    @Test
    public void findByid()
    {
        Account account = getJdbcTemplate().queryForObject("SELECT * FROM account WHERE id=?", new MyrowMapper(), "1");

        System.out.println(account);
    }

    /**
     * 查询所有
     */
    @Test
    public void findList()
    {
        List<Account> query = getJdbcTemplate().query("SELECT * FROM account", new MyrowMapper());

        System.out.println(query);
    }


}

//定义一个接口的实现类，用于封装对象
class MyrowMapper implements RowMapper<Account>
{

    @Override
    public Account mapRow(ResultSet rs, int i) throws SQLException
    {
        Account account = new Account();

        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getInt("money"));

        return account;
    }
}