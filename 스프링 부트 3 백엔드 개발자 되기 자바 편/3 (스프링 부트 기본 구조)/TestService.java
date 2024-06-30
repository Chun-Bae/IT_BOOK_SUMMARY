package org.chunbae.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestService {

    // MemberRepository 클래스(빈)를 주입받는다.
    @Autowired
    MemberRepository memberRepository;
    // MemberRepository 클래스의 findAll 메소드를 호출하여,
    // 모든 Member 객체를 반환한다.
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}