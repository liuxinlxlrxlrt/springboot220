package com.sxt.aspect;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@EnableAspectJAutoProxy //默认打开为true,不用添加
public class MyAspect {

    @Pointcut(value = "execution(* com.sxt.domain.*.*(..))")
    public void pc(){


    }

    @Before(value = "pc()") //前置通知
    public void before(){
        System.out.println("吃点水果");
    }

    public void aroundBefore(){
        System.out.println("环绕+Around吃点水果");
    }

    public void aroundAfter(){
        System.out.println("环绕+Around搞一根");
    }

    @AfterReturning(pointcut = "pc()")  //后置通知
    public void after(){
        System.out.println("搞一根");
    }


    @After(value = "pc()")  //最终后置通知
    public void afterend(){
        System.out.println("休息");
    }

    @Around(value = "pc()") //环绕通知
    public void round(ProceedingJoinPoint proceedingJoinPoint){
        //获取方法的参数
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("----------------");
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature);
        //获取切入点方法的名字
        System.out.println(signature.getName());
        System.out.println("----------------");
        //获取切入点所在目标对象
        String name = proceedingJoinPoint.getTarget().getClass().getName();
        System.out.println(name);
        System.out.println("----------------");

        aroundBefore();
        try {
            //获取返回值
            Object proceed = proceedingJoinPoint.proceed();//执行目标方法
            System.out.println(proceed+"......");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕+异常");
        }finally {
            System.out.println("环绕+最终执行");
        }
       aroundAfter();
    }

    @AfterThrowing(pointcut = "pc()",throwing = "throwable")
    public void error(Throwable throwable){
        System.out.println("目标出现异常");
    }
}
