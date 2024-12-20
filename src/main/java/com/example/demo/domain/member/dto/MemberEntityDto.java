package com.example.demo.domain.member.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.demo.domain.member.entity.MemberEntity}
 */
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class MemberEntityDto implements Serializable {
    Long idx;
    String memberId;
    String name;
    String addr;
    int age;
}