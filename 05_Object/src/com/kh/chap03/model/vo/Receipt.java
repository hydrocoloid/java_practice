package com.kh.chap03.model.vo;

public class Receipt {
	
	private int price;
	private String payment;
	private String storeName;
	private String date;
	//가격, 결제 방법, 점포명, 결제일시

	//생성자부 - 월요일에 할게요~
	
	//메소드부 - getter(), setter(), info() 
	
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price) { //메서드 선언 (Method Declaration)
		this.price = price;
		/* 문장 뜯어 보기
		 * public: 접근제한자 
		 * void: 반환 타입 (Return Type) = 아무 것도 반환하지 않는다 / 만약 숫자를 돌려줘야 한다면 void 대신 int라고 적어야 합니다.
		 * set필드명: 메서드명 (Method Name) = 이 기능의 이름입니다. -> set 썼으니까 setter()겠군.
		 * (자료형 필드식별자): 매개변수 = 메서드가 일을 하기 위해 외부로부터 받아오는 재료
		 * this.price = price; => 좌항 price(필드)에 우항 price(전달받은 매개변수값)을 대입(=).
		 */
		}
	
	public String getPayment(){
		return payment;
		}
	
	public void setPayment(String payment) { 
		this.payment = payment;
		}
	
	public String getStoreName(){
		return storeName;
		}
	
	public void setStoreName(String storeName) { 
		this.storeName = storeName;
		}
	
	public String getDate(){
		return date;
		}
	
	public void setDate(String date) { 
		this.date = date;
		}
	
	//info
	public String info() {
		String info = "상품명: "+storeName
					+ " / 금액: "+price
					+ " / 결제수단: "+payment
					+ " / 결제일시: "+date;
		return info;
		}
	
}
