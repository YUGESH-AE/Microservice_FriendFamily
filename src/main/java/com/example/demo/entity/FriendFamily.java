package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "friendfamily_details")
public class FriendFamily {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name = "phone_no")
    Long phoneNo;
    @Column(name = "friend_and_family")
    Long friendAndFamily;
}
