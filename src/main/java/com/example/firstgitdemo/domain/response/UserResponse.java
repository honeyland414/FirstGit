package com.example.firstgitdemo.domain.response;


import com.example.firstgitdemo.domain.Order;
import com.example.firstgitdemo.domain.User;
import lombok.*;

import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserResponse {
    private User user;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
