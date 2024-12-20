package com.example.demo.domain.member.service;


import com.example.demo.domain.member.entity.MemberEntity;
import com.example.demo.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
