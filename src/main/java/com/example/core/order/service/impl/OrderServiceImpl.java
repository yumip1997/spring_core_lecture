package com.example.core.order.service.impl;

import com.example.core.discount.DiscountPolicy;
import com.example.core.memeber.respository.MemberRepository;
import com.example.core.memeber.vo.Member;
import com.example.core.order.service.OrderService;
import com.example.core.order.vo.Order;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);

        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
