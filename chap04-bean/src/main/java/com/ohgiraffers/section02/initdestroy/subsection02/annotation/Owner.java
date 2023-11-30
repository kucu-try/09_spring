package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Owner {
    @PostConstruct
    public void openShop(){
        System.out.println("사장님이 가게 문을 열었습니다. 이제 쇼핑 ㄱㄱ");
    }

    @PreDestroy
    public void closeShop(){
        System.out.println("사장님이 가게 문을 닫았습니다. 바이~ 바이~");
    }
}
