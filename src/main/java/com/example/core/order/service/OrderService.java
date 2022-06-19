package com.example.core.order.service;

import com.example.core.order.vo.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
