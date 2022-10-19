package com.example.firstgitdemo.domain.response;


import com.example.firstgitdemo.domain.Order;
import com.example.firstgitdemo.domain.User;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderResponse {
    private Order order;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
