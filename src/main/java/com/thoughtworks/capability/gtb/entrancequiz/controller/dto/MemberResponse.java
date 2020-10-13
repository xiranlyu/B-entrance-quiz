package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;

public class MemberResponse {
    private final String name;

    public MemberResponse(Member member) {
        this.name = member.getName();
    }

    public String getName() {
        return name;
    }
}

