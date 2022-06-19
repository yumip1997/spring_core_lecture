package com.example.core.order.service.impl;

import com.example.core.discount.impl.FixedDiscountPolicy;
import com.example.core.memeber.respository.impl.MemberRepositoryImpl;
import com.example.core.memeber.vo.Grade;
import com.example.core.memeber.vo.Member;
import com.example.core.order.service.OrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    OrderService orderService = new OrderServiceImpl(new MemberRepositoryImpl(), new FixedDiscountPolicy());


    @Test
    void order_test(){
        Member member = new Member(1L, "MEMBER1", Grade.VIP);

    }
}