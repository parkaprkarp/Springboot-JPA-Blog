package com.park.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//쓸모없는 JAVA 파일 만들면 안되는 이유 : 스프링이 com.park.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 안하고 특정 어노테이션이 붙어있는 클래스 파일을 IoC 스프링 컨테이너에 관리
@RestController
public class BlogControllerTest {

	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
