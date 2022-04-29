package com.jayon.awsstarter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/api/members")
    @ResponseStatus(HttpStatus.OK)
    public String view() {
        return "jayon";
    }
}
