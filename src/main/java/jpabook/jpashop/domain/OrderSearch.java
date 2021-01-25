package jpabook.jpashop.domain;

import lombok.*;

import java.util.List;

@Getter @Setter
public class OrderSearch {

    private String memberName;          // 회원 이름
    private OrderStatus orderStatus;    // 주문 상태[ORDER, CANCEL]

}
