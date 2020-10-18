package com.park.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 사용자 요청 -> 응답(HTML 파일, JSP) 일때 @Controller
// 사용자 요청 -> 응답(Data) 일때 @RestController
@RestController // 
public class HttpControllerTest {

	private static final String TAG = "HttpControllerTest : ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		
//		Member m = new Member(1, "tkddyd", "1234", "naver.com");
		
		Member m = Member.builder().userName("tkddyd").passWord("1234").eamil("naver.com").build(); // 	@Builder // 넣을때 순서를 지키지 않아도 됌
		System.out.println(TAG+"getter : "+m.getUserName());
		m.setUserName("tkddyd1");
		System.out.println(TAG+"getter : "+m.getUserName());
		return "lombook test 완료";
	}
	
	@GetMapping("/http/get")
	public String getTest(Member m) {

		return "getTest : " + m.getId() + m.getId();
	}
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) { //MessageConverter (스프링부트)가 자동으로 JSON으로 봐꿔줌
		return "postTest : " + m.getId() + m.getUserName() + m.getPassWord() + m.getEamil();
	}
	@PutMapping("/http/put")
	public String putTest() {
		return "putTest";
	}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "deleteTest";
	}
}
