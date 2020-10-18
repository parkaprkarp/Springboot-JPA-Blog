package com.park.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControlloerTest {

	@GetMapping("/temp/jsp")
	public String tempHome() {
		//prefix : /WEB-INF/views/
		//suffix : .jsp
		// 풀네임은 : /WEB-INF/views/~.jsp
		System.out.println("템프 홈입니다.");
		return "test" ;
	}
}
