package com.example.core.discount.impl;

import com.example.core.discount.DiscountPolicy;
import com.example.core.memeber.vo.Grade;
import com.example.core.memeber.vo.Member;

public class FixedDiscountPolicy implements DiscountPolicy {

    private final int DISCOUNT_FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return DISCOUNT_FIX_AMOUNT;
        }else{
            return 0;
        }
    }
}
