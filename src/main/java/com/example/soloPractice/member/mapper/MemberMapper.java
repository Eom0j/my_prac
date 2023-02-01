package com.example.soloPractice.member.mapper;

import com.example.soloPractice.member.dto.MemberPatchDto;
import com.example.soloPractice.member.dto.MemberPostDto;
import com.example.soloPractice.member.dto.MemberResponseDto;
import com.example.soloPractice.member.entity.Member;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto(Member member);
//    public Member memberPostDtoToMember(MemberPostDto memberPostDto) {
//        return new Member(0L,
//                memberPostDto.getEmail(),
//                memberPostDto.getName(),
//                memberPostDto.getPhone());
//    }
//
//    public Member memberPatchDtoToMember(MemberPatchDto memberPatchDto) {
//        return new Member(memberPatchDto.getMemberId(),
//                null,
//                memberPatchDto.getName(),
//                memberPatchDto.getPhone());
//    }
//
//    public MemberResponseDto memberToMemberResponseDto(Member member) {
//        return new MemberResponseDto(member.getMemberId(),
//                member.getEmail(),
//                member.getName(),
//                member.getPhone());
//    }
}
