package com.learn.springFramework.aspect;

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
}
