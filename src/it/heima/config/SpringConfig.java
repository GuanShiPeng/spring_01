package it.heima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by GuanShiPeng on 2017/7/28 17:08.
 */
@ComponentScan(value = {"it.heima.daoimp","it.heima.domain","it.heima.serviceimp"})
@Configuration
public class SpringConfig
{

}
