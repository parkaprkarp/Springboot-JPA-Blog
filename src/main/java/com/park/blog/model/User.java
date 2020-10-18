package com.park.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
// ORM은 -> 언어를 테이블로 매핑해주는 기술 그럼 JPA가 테이블로 만들어줌
@Entity // user 클래스가 스프링부트가 실행될때 MySql에 테이블이 생성이 된다.
public class User {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // PK - 오토인크리먼트할꺼
	
	@Column(nullable = false, length = 30) // 낫널
	private String userName; // 아이디
	
	@Column(nullable = false, length = 100) 
	private String passWord; // 비번
	
	@Column(nullable = false, length = 50)
	private String email; // 이메일
	
	@ColumnDefault("'user'")
	private String role;
	
	@CreationTimestamp // 시간 등록 Mysql Now() 같은 기능
	private Timestamp createDate; // 생성날짜

}
