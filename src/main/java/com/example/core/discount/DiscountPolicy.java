package com.example.core.discount;

import com.example.core.memeber.vo.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
