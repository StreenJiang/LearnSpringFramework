package com.learn.springFramework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
    @Before("execution(* com.learn.springFramework.service..*(..))")
    public void beforeAdvice() {
        System.out.println("AOP: before invoking");
    }

    @Around("@annotation(com.learn.springFramework.aspect.annotation.PointCut)")
    public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("AOP: around advice starts working...");

        Object proceed = point.proceed();

        System.out.println("AOP: around advice work done...");

        return proceed;
    }
}
