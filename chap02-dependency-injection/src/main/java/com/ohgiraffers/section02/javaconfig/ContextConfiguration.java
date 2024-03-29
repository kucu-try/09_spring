package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20,"110-232-3423");
    }

    @Bean
    public MemberDTO memberGenerator() {
        MemberDTO member = MemberDTO.builder()
                .seq(30)
                .email("sdrgsrg@sf.com")
                .name("홍성엉")
                .personalAccount(accountGenerator())
                .phone("010-2343-3434").build();

        return member;
    }
}
