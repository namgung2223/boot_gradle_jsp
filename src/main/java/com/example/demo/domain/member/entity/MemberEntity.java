package com.example.demo.domain.member.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member")
@Getter @Setter
@ToString
@NoArgsConstructor @AllArgsConstructor
public class MemberEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private Long idx;

    @Column(name = "memberId")
    private String memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "addr")
    private String addr;

    @Column(name = "age")
    private int age;


}
