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
//TODO GTB: 配置跨域时尽量避免使用通配符，应指定特定的域名
@CrossOrigin( origins = "*", allowedHeaders = "*")

@RequestMapping("/members")
public class MemberResource {
    private final MemberService memberService;

    public MemberResource(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    //TODO GTB: 创建资源的操作应当返回新创建的资源
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