package com.example.core.memeber.service.impl;

import com.example.core.memeber.respository.impl.MemberRepositoryImpl;
import com.example.core.memeber.service.MemberService;
import com.example.core.memeber.vo.Grade;
import com.example.core.memeber.vo.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberServiceImplTest {

    MemberService memberService = new MemberServiceImpl(new MemberRepositoryImpl());

    @Test
    void joinAndFindTest(){
        //given
        Member member = new Member(1L, "member1", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}