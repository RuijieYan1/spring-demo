package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

//表示当前类是切面类    切面的功能  时间和位置
@Component
@Aspect
public class MyAspect {
    /*定义方法：方法是实现切面功能的
       方法定义的要求：
       1、public
       2、没有返回值
       3、名称自定义
       4、方法可以有参数也可以没有参数   如果有参数，参数不是自定义的 有几个参数类型可以使用
     */
   @Before(value="execution(public void aop.SomeServiceImp.doSome(String,Integer))")
    public void myBefore(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();
        for(Object o:args){
            System.out.println(o);
        }
        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间"+new Date());
    }


    //后置通知  在目标方法之后执行的   能够获取到目标方法的返回值
    @AfterReturning(value = "execution(public String aop.SomeServiceImp.doOther())",returning = "res")
    public void myAfter(Object res){
        System.out.println("后置通知"+res);
    }

}
