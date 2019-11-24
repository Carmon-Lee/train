package order.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderCreateDto {

    private String userName;

    private List<Product> products;
}
