package com.thoughtworks.capability.gtb.entrancequiz.domain;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.MemberRequest;

public class Member {
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public Member(MemberRequest request) {
        this.name = request.getName();
    }

    public String getName() {
        return name;
    }
}
