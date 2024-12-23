package com.example.demo.domain.member.repository;

import com.example.demo.domain.member.entity.MemberEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QMemberRepository {

    Page<MemberEntity> pagingMember(Pageable pageable);

}
