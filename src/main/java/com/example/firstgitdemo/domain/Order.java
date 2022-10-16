package com.example.firstgitdemo.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

//    @Column(name = "user_id")
//    private Integer userId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
