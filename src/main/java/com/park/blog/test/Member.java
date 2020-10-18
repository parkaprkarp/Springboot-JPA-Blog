package com.park.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter
@Data
//@AllArgsConstructor // 전체생성자
@NoArgsConstructor // 빈생성자
public class Member {

	private int id;
	private String userName;
	private String passWord;
	private String eamil;

	@Builder // 넣을때 순서를 지키지 않아도 됌
	public Member(int id, String userName, String passWord, String eamil) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.eamil = eamil;
	}
}
