package jpabook.jpashop.repository.order.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class OrderItemQueryDto {

    @JsonIgnore
    private Long orderId;       // 주문번호
    private String itemName;    // 상풍명
    private int orderPrice;     // 주문가격
    private int count;          // 주문수량

    public OrderItemQueryDto(Long orderId, String itemName, int orderPrice, int count) {
        this.orderId    = orderId;
        this.itemName   = itemName;
        this.orderId    = orderId;
        this.count      = count;
    }
}
