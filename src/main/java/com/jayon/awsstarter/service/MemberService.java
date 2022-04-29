package com.jayon.awsstarter.service;

import com.jayon.awsstarter.domain.Member;
import com.jayon.awsstarter.dto.MemberRequest;
import com.jayon.awsstarter.dto.MemberResponse;
import com.jayon.awsstarter.repository.MemberRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberResponse> findAll() {
        return memberRepository.findAll().stream()
                .map(member -> new MemberResponse(member.getId(), member.getName(), member.getHobby()))
                .collect(Collectors.toList());
    }

    public void saveMember(MemberRequest memberRequest) {
        memberRepository.save(new Member(memberRequest.getName(), memberRequest.getHobby()));
    }
}
