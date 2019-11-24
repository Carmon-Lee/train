package org.shopping.order.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shopping.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    void getByPk() {
        List<Order> byPk = orderService.getByPk();
    }
}