package it.heima.domain;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.PropertyResolver;

/**
 * Created by GuanShiPeng on 2017/7/26 15:21.
 */
public class User
{
    private Integer user_id;
    private String user_age;
    private String user_gender;
    private Customer customer;

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public User()

    {
    }

    public User(Integer user_id, String user_age, String user_gender)
    {
        this.user_id = user_id;
        this.user_age = user_age;
        this.user_gender = user_gender;
    }

    public Integer getUser_id()
    {
        return user_id;
    }

    public void setUser_id(Integer user_id)
    {
        this.user_id = user_id;
    }

    public String getUser_age()
    {
        return user_age;
    }

    public void setUser_age(String user_age)
    {
        this.user_age = user_age;
    }

    public String getUser_gender()
    {
        return user_gender;
    }

    public void setUser_gender(String user_gender)
    {
        this.user_gender = user_gender;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "user_id=" + user_id +
                ", user_age='" + user_age + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", customer=" + customer +
                '}';
    }
}
