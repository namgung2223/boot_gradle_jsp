package com.example.demo.application.controller;


import com.example.demo.domain.member.entity.MemberEntity;
import com.example.demo.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;



    @GetMapping("/")
    public String home(Model model, @PageableDefault(size = 5,sort = "idx", direction = Sort.Direction.DESC) Pageable pageable){
        Page<MemberEntity> attributeValue = memberService.pagingMember(pageable);
        model.addAttribute("page", attributeValue);
        return "home";
    }

}
