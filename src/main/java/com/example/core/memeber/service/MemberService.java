package com.example.core.memeber.service;

import com.example.core.memeber.vo.Member;

public interface MemberService {

    void join(Member member);
    Member findMember(Long memberId);

}
