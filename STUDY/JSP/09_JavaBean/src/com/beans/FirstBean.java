package com.beans;

public class FirstBean {
	// beans 는 데이터를 저장하는 자바 파일을 의미
	// beans == VO == DTO
	
	// beans 규약 : 빈즈의 필드는 무조건 private 으로 만들어야 한다.
	private String name = "hong, gil-dong";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}