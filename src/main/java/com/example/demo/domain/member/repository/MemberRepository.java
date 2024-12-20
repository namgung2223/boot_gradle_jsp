package com.example.demo.domain.member.repository;

import com.example.demo.domain.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    MemberEntity findByName(String name);
}
