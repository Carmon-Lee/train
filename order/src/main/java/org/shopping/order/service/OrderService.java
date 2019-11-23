package org.shopping.order.service;

import org.shopping.order.dao.OrderMapper;
import org.shopping.order.entity.Order;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements InitializingBean {

    @Autowired
    private OrderMapper orderMapper;


    public List<Order> getByPk() {
        return orderMapper.getOrderById(1);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println();
        orderMapper.getOrderById(1);
    }
}
