package com.example.soloPractice.member.controller;

import com.example.soloPractice.member.dto.MemberPatchDto;
import com.example.soloPractice.member.dto.MemberPostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController //해당 클래스가 REST API의 리소스를 처리하기 위한 API 엔드포인트로 동작함을 정의
@RequestMapping("/v1/members") //클라이언트의 요청과 클라이언트의 요청을 처리하는 핸들러 메서드를 매핑해줌
public class MemberController {
    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberPostDto memberPostDto) {
        return new ResponseEntity<>(memberPostDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") long memberId,
                                      @RequestBody MemberPatchDto memberPatchDto){
        memberPatchDto.setMemberId(memberId);
        memberPatchDto.setName("홍길동");

        return new ResponseEntity<>(memberPatchDto, HttpStatus.OK);
    }


    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId:" + memberId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
