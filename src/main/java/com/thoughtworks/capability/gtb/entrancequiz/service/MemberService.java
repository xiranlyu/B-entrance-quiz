package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final List<Member> members = new ArrayList<>();

    public void save(Member member) {
        members.add(member);
    }

    public List<Member> getAll() {
        return members;
    }
}
