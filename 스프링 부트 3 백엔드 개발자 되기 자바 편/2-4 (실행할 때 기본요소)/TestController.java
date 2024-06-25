package org.chunbae.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}

// @RestController
// Restful 서비스를 제공하는 컨트롤러를 선언할 때 사용하는 어노테이션
// 라우터 역할을 한다.

// @GetMapping
// Get 요청을 처리하는 메소드를 선언할 때 사용하는 어노테이션