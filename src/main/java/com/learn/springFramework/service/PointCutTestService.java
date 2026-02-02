package com.learn.springFramework.service;

import com.learn.springFramework.aspect.annotation.PointCut;
import org.springframework.stereotype.Service;

@Service
public class PointCutTestService {
    public void test1() {
        System.out.println("This is test1...");
    }

    @PointCut
    public void test2() {
        System.out.println("This is test2...");
    }

    @PointCut
    public String getStr(String str) {
        System.out.println("This is getStr...");
        return str;
    }
}
