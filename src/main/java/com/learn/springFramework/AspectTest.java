package com.learn.springFramework;

import com.learn.springFramework.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectTest.class);
        StudentService studentService = context.getBean(StudentService.class);
        studentService.print(studentService.getInfo());
    }
}
