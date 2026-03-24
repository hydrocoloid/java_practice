package com.kh.chap07.model.vo;

public class Ticket {
	// 티켓을 세 개까지 추가할 수 있음. -> 티켓을 추가할 수 있는 기능
	// 이용자는 추가되어 있는 티켓을 발급 받을 수 있음. 
	
	//이코노미 티켓: 가격. 좌석 번호. 서비스, 기내식. 
	
	private int price;
	private String seatNumber;
	private String service;
	private String meal;
	
	// 우리 많이 배웠다.
	// 생성자 -> 기본생성자, 매개변수 생성자
	// 메소드 -> 게터, 세터, 필드값 합쳐서 반환해주는 메소드
	
	//생성자: 접근제한자 변수명(){}
	public Ticket() {}
	public Ticket(String meal, String service, String seatNumber, int price) {
		this.meal = meal;
		this.service = service;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	
	public String getMeal() {
		return meal;
	}
	
	public void setMeal(String meal) { 
		this.meal = meal;
		}
	
	public String getService() {
		return service;
	}
	
	public void setService(String service) { 
		this.service = service;
		}
	
	public String getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(String seatNumber) { 
		this.seatNumber = seatNumber;
		}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) { 
		this.price = price;
		}
	
	//info
	public String info() {
		String info = "기내식: "+meal
					+ " / 서비스: "+service
					+ " / 좌석번호: "+seatNumber
					+ " / 가격: "+price;
		return info;
		}

}
