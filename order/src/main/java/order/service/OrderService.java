package order.service;

import lombok.extern.slf4j.Slf4j;
import order.commons.dao.OrderMapper;
import order.dto.OrderCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public String createOrder(OrderCreateDto orderCreateDto) {
        log.info("create order:{}",orderCreateDto);
        return "success";
    }

}
