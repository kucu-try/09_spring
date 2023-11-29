package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
* subsection01.primary
* @Primary 어노테이션을 설정하면 @Autowired 로 동일한 타입의 여러 빈을 찾게 되는 경우 자동으로
* 연결을 우선 시 할 타입을 설정하게 된다.
* 동일한 타입의 클래스 중 한 개만 @primary 어노테이션을 사용할 수 있다.
* */
@Component
@Primary
public class Charmander implements Pokemon{
    @Override
    public void attack() {
        System.out.println("파이리 불꽃 공격!!");
    }
}
