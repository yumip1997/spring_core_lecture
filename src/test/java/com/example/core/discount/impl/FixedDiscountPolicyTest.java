package com.example.core.discount.impl;

import com.example.core.memeber.vo.Grade;
import com.example.core.memeber.vo.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FixedDiscountPolicyTest {

    FixedDiscountPolicy fixedDiscountPolicy = new FixedDiscountPolicy();

    @Test
    void vip_test(){
        Member member = new Member(1L, "member1", Grade.VIP);

        int discountPrice= fixedDiscountPolicy.discount(member, 0);

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void basic_test(){
        Member member = new Member(1L, "member1", Grade.BASIC);

        int discount = fixedDiscountPolicy.discount(member, 0);
        
        Assertions.assertThat(discount).isEqualTo(0);
    }

}