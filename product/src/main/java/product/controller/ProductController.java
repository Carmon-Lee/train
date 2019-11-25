package product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("product")
@Slf4j
public class ProductController {

    // 购买商品，减库存
    @PostMapping(value = "/decStock")
    String decStock(@RequestBody Map<String, Object> products){
        log.info("ready to dec stock for products,{}",products);
        return "";
    }
}
