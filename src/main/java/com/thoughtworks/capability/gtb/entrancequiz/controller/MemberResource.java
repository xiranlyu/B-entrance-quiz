package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.MemberRequest;
import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.MembersResponse;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;
import com.thoughtworks.capability.gtb.entrancequiz.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")

@RequestMapping("/members")
public class MemberResource {
    private final MemberService memberService;

    public MemberResource(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<Void> createMember(@RequestBody MemberRequest request) {
        memberService.save(new Member(request));
        return ResponseEntity.status(CREATED).build();
    }

    @GetMapping
    public ResponseEntity<MembersResponse> getAllMembers() {
        List<Member> members = memberService.getAll();
        return ResponseEntity.ok(new MembersResponse(members));
    }
}