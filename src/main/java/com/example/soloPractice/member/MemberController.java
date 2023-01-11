package com.example.soloPractice.member;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController //해당 클래스가 REST API의 리소스를 처리하기 위한 API 엔드포인트로 동작함을 정의
@RequestMapping(value = "/v1/members", produces = {MediaType.APPLICATION_JSON_VALUE}) //클라이언트의 요청과 클라이언트의 요청을 처리하는 핸들러 메서드를 매핑해줌
public class MemberController {
    @PostMapping
    public String postMember(@RequestParam("email")String  email,
                             @RequestParam("name")String name,
                             @RequestParam("phone")String phone) {
        System.out.println("# email:" + email);
        System.out.println("# name:" + name);
        System.out.println("# phone" + phone);

        String response =
                "{\"" +
                        "email\":\""+email+"\"," +
                        "\"name\":\""+name+"\",\"" +
                        "phone\":\"" + phone+
                        "\"}";
        return response;
    }

    @GetMapping("/{member-id}")
    public String getMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId:" + memberId);

        return null;
    }

    @GetMapping
    public String getMembers() {
        System.out.println("# get Members");

        return null;
    }
}
