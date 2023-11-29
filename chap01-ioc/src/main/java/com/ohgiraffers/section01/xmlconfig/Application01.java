package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.section01.test.SnsLogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application01 {
    public static void main(String[] args) {
        //Spring 프레임워크에서는 Spring IoC 컨테이너에 의해 관리되는 객체를 'Spring Bean'이라고 합니다.
        // Spring Ioc 컨테이너는 애플리케이션의 구성 요소들을 생성하고 관리하는데, 이러한 구성 요소들이 Spring Bean입니다.
        ApplicationContext context = new GenericXmlApplicationContext(
                "section01/xmlconfig/spring-context.xml");

//        // Bean 의 이름으로 꺼내오는 방법
//        MemberDTO member = (MemberDTO) context.getBean("member");

        // 빈의 타입으로 꺼내오는 방법
//        MemberDTO member = context.getBean(MemberDTO.class);

        // 빈의 id와 클래스 메타 정보를 전달하여 가져오는 방법
        MemberDTO member = context.getBean("member", MemberDTO.class);
        System.out.println(member);

        System.out.println("=====================");

        SnsLogin login = context.getBean("naver",SnsLogin.class);
        login.login();




    }
}
