package order.service;

import order.dao.OrderMapper;
import order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getByPk() {
        return orderMapper.getOrderById(1);
    }

}
