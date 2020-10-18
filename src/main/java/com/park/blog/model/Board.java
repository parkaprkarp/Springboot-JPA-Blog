package com.park.blog.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.ColumnDefault;

public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;

	@Column(nullable = false ,length = 100)
	private String title;
	
	@Lob // 대용량 데이터
	private String content;
	
	@ColumnDefault("0") // 컬럼 디폴트 값
	private int count;
}
