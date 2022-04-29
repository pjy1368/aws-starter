package com.jayon.awsstarter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponse {

    private Integer id;

    private String name;

    private String hobby;
}
