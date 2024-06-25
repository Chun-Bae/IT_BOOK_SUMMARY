package org.chunbae.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}


// @SpringBootApplication
// Spring Boot 어플리케이션을 실행할 때 사용하는 어노테이션

// 인텔리제이에서 컨트롤 클릭으로 들어가면 아래와 같이 정의되어 있다.

// @SpringBootConfiguration
// 스프링 부트 관련 설정 어노테이션 @Configuration을 상속받아 구현되어 있다.

// @EnableAutoConfiguration
// 스프링 부트의 자동 설정을 활성화하는 어노테이션

// @ComponentScan
// 사용자 등록 빈을 찾아서 등록해주는 어노테이션
// @Component와 그것을 감싸는 어노테이션들을 찾아서 모두 빈으로 등록해주는 어노테이션