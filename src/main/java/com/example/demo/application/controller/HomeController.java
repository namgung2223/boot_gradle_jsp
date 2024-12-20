package com.example.demo.application.controller;


import com.example.demo.domain.member.entity.MemberEntity;
import com.example.demo.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;

    @GetMapping("/")
    public String home(){
        int idx = 1;
        MemberEntity member =  memberService.findbyId((long) idx);
        MemberEntity membe2r =  memberService.findbyName("lee");
        return "home";
    }

}
