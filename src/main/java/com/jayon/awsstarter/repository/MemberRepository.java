package com.jayon.awsstarter.repository;

import com.jayon.awsstarter.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
