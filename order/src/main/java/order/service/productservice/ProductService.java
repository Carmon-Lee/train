package order.service.productservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface ProductService {

    // 购买商品，减库存
    @PostMapping(value = "/product/decStock")
    String decStock(List<Map<String, Object>> products);

}
