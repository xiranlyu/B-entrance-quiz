package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

public class MemberRequest {
    private String name;

    public MemberRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
