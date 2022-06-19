package com.example.core.memeber.service.impl;

import com.example.core.memeber.respository.MemberRepository;
import com.example.core.memeber.service.MemberService;
import com.example.core.memeber.vo.Member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
