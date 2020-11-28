package com.sxt.domain;

import org.springframework.stereotype.Component;

@Component  //放入IOC容器
public class Man {

    public String eat(String food) {
        System.out.println("吃：" + food);
//        int i = 10 / 0;
        return "很爽";
    }
}
