package order.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import order.commons.dao.OrderMapper;
import order.dto.OrderCreateDto;
import order.service.productservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ProductService productService;

    public String createOrder(OrderCreateDto orderCreateDto) {
        log.info("create order:{}",orderCreateDto);
        List<Map<String, Object>> productMapList = orderCreateDto
                .getProducts().stream()
                .map(p -> (Map<String, Object>)JSON.parseObject(JSON.toJSONString(p), Map.class))
                .collect(Collectors.toList());

        log.info("calling product service for dec stock...");
        productService.decStock(productMapList);
        return "success";
    }

}
