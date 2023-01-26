package com.example.soloPractice.member.controller;

import com.example.soloPractice.member.dto.MemberPatchDto;
import com.example.soloPractice.member.dto.MemberPostDto;
import com.example.soloPractice.member.entity.Member;
import com.example.soloPractice.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //해당 클래스가 REST API의 리소스를 처리하기 위한 API 엔드포인트로 동작함을 정의
@RequestMapping("/v1/members") //클라이언트의 요청과 클라이언트의 요청을 처리하는 핸들러 메서드를 매핑해줌
@Validated
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberPostDto) {
        Member member = new Member();

        member.setEmail(memberPostDto.getEmail());
        member.setName(memberPostDto.getName());
        member.setPhone(memberPostDto.getPhone());

        Member response = memberService.createMember(member);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Positive long memberId,
                                      @Valid @RequestBody MemberPatchDto memberPatchDto){
        memberPatchDto.setMemberId(memberId);

        Member member = new Member();

        member.setMemberId(memberPatchDto.getMemberId());
        member.setName(memberPatchDto.getName());
        member.setPhone(memberPatchDto.getPhone());

        Member response = memberService.updateMember(member);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {
        Member response = memberService.findMember(memberId);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        List<Member> response = memberService.findMembers();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId) {
        System.out.println("# delete member");

        memberService.deleteMember(memberId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}


//[기본] 매퍼(Mapper)를 이용한 DTO 클래스 ↔ 엔티티(Entity) 클래스 매핑 부터