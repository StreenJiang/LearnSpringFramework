package com.learn.springFramework.service.impl;

import com.learn.springFramework.entity.Address;
import com.learn.springFramework.entity.Student;
import com.learn.springFramework.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void print(Student stu) {
        System.out.println("Calling internal method");
        getInfo(); // This method does not be enhanced both in JDK dynamic proxy or CGLib proxy

        System.out.println("This is current student: " + stu.toString());
    }

    @Override
    public Student getInfo() {
        Student student = new Student();
        student.setId(100);
        student.setName("Jack");
        student.setAge(20);

        Address address = new Address();
        address.setId(1001);
        address.setName("Wall Street");
        student.setAddresses(List.of(address));
        return student;
    }
}
