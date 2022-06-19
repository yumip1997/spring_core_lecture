package com.example.core.memeber.respository;

import com.example.core.memeber.vo.Member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);

}
