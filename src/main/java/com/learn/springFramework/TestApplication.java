package com.learn.springFramework;

import com.learn.springFramework.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");
        System.out.println("student: " + student);

        Student student1 = (Student) context.getBean("student");
        System.out.println("student1: " + student1);

        System.out.println("==================");
        System.out.println("They are the same student: " + (student == student1));
        System.out.println("==================");

        Student student2 = (Student) context.getBean("student2");
        System.out.println("student2: " + student2);

        Student student2_2 = (Student) context.getBean("student2");
        System.out.println("student2_2: " + student2_2);

        System.out.println("==================");
        System.out.println("They are the same student: " + (student2 == student2_2));
        System.out.println("==================");
    }
}
