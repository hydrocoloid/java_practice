package com.kh.football.model.vo;

import java.util.Objects;

//Update를 구현해야 하는데 record로 구현하면 필드에 final 키워드가 붙어 수정이 불가능해짐.
public class FootballPlayer {
	private String name; //이름 저장 필드
	private String position; //포지션 저장 필드
	private Integer backNumber;  //등번호 저장 필드
	private int id; //동명이인 구분하기 위해 실무에서는 1) 정수 번호 부여. 2) 영어+숫자 조합
	
	public FootballPlayer(int id, String name, String position, Integer backNumber) {
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(Integer backNumber) {
		this.backNumber = backNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(backNumber, id, name, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		return Objects.equals(backNumber, other.backNumber) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position);
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", position=" + position + ", backNumber=" + backNumber + ", id=" + id
				+ "]";
	}
	
	
	
}
