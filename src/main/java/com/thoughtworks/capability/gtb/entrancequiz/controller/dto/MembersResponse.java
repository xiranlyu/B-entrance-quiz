package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;


import java.util.List;
import java.util.stream.Collectors;

public class MembersResponse {
    private final List<MemberResponse> members;

    public MembersResponse(List<Member> members) {
        this.members = members.stream().map(MemberResponse::new).collect(Collectors.toList());
    }

    public List<MemberResponse> getMembers() {
        return members;
    }
}
