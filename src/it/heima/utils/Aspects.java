package it.heima.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by GuanShiPeng on 2017/7/29 15:07.
 */

@Component
@Aspect
public class Aspects
{
    //在切入点方法执行之前执行
    @Before(value = "execution(* it.heima.serviceimp.CustomerAopImp.save())")
    public void before()
    {
        System.out.println("before");
    }

    //在切入点方法执行完之后执行,还可以获取切入点的返回值
    @AfterReturning(value = "execution(* it.heima.serviceimp.CustomerAopImp.delete())", returning = "ex")
    public void after_returning(Object ex)
    {
        System.out.println("after_returning:"+ex);

    }

    //在切入点执行前后执行,可以阻止目标方法的执行
    @Around(value = "execution(* it.heima.serviceimp.CustomerAopImp.update())")
    public Object around(ProceedingJoinPoint pj) throws Throwable
    {
        System.out.println("环绕方法执行之前");
        Object proceed = pj.proceed();
        System.out.println("环绕方法执行之后"+proceed);
        return 345;
    }

    //在切入点执行要抛异常的时候执行
    @AfterThrowing(value = "execution(* it.heima.serviceimp.CustomerAopImp.find(..))",throwing = "ex")
    public void after_throwing(Throwable ex)
    {
        System.out.println(ex.getMessage());
        System.out.println("after-throwing");

    }

    //在切入点执行后都要执行的方法，最终要执行的方法
    @After(value = "Aspects.t1()")
    public void after()
    {
        System.out.println("after");
    }

    @Pointcut(value = "execution(* it.heima.serviceimp.CustomerAopImp.findAll())")
    public void t1(){

    }
}
