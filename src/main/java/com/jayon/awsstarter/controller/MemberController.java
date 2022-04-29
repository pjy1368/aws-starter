package com.jayon.awsstarter.controller;

import com.jayon.awsstarter.dto.MemberRequest;
import com.jayon.awsstarter.dto.MemberResponse;
import com.jayon.awsstarter.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/api/members")
    @ResponseStatus(HttpStatus.OK)
    public List<MemberResponse> view() {
        return memberService.findAll();
    }

    @PostMapping("/api/members")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody MemberRequest memberRequest) {
        memberService.saveMember(memberRequest);
    }
}
