package com.kh.football.model.dto;

/*DTO: Data Transfer Object = 값 전송 객체
 * 순수하게 데이터를 옮겨 담을 용도로 만드는 클래스
 */
public class FootballPlayerDto {
	
	private String name;
	private String position;
	private int backNumber;
	
	/*기본생성자, 매개변수생성자, 게터세터.
	  VO클래스랑 닮았네? DTO가 없어서 VO를 이렇게 한 것.
	  VO에 세터가 들어가면 안 돼. final. VO는 불변이어야 함.
	*/
	
	public FootballPlayerDto() {
		super();
	}
	
	public FootballPlayerDto(String name, String position, int backNumber) {
		super();
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
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

	public int getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	
	

}
