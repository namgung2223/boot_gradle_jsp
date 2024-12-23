package com.example.demo.domain.member.service;


import com.example.demo.domain.member.entity.MemberEntity;
import com.example.demo.domain.member.repository.MemberRepository;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public MemberEntity findbyId(Long idx){
        MemberEntity memberEntity = memberRepository.findById(idx).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));
        return memberEntity;
    }

    public MemberEntity findbyName(String name){
        MemberEntity memberEntity = memberRepository.findByName(name);
        return memberEntity;
    }

    public void saveAllMember(List<MemberEntity> list){
        MemberEntity membe2r =  memberRepository.findByName("lee");
        membe2r.setAge(40);
//        memberRepository.saveAll(list);
    }

    public Page<MemberEntity> pagingMember(Pageable pageable){
        return memberRepository.pagingMember(pageable);
    }
}
