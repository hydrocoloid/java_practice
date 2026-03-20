package com.kh.chap02.encapsulation.model.vo;

public class AutoSellingMachine { //단 한 개의 제품을 파는 자판기
	//필드부, 생성자부, 메소드부
	
	/* [필드부]
	 * 객체가 가질 수 있는 속성(member)을 기술하는 영역. => 값을 담는 부분.
	 * 위치: 클래스 내부, 메소드 외부. 
	  
	 * 접근제한자 자료형 필드식별자;
	 * 필드 = 멤버 변수.
	 * 필드의 목적: 객체들이 가져야 할 공통적인 속성을 기술해 놓는 것. 추상화를 끝내고 이 객체들이 들어 갈 이런 공간이 필요하겠구나 -> 선언.
	 
	 * 클래스와 객체를 구분할 것. 
	 * 클래스: 객체를 만들어 내기 위한 추상적 틀.
	 * 객체: 구현된 실체. 
	 */
	
	
	private String name; // 제품의 이름을 저장할 필드.
	private int price; // 제품의 가격을 저장할 필드.
	private int amount; // 제품의 수량을 저장할 필드.
	
	/*
	name = "삼양라면";
	price = 1100;
	amount = 50;
	*/
	
		/*단일 책임 원칙: 하나의 클래스가 하나의 책임만을 가져야 한다.
		 * 그런데 Run 클래스에서 필드값을 조작할 수 있다. 예) asm.name = "삼양라면";
		 * 그렇게 할 수 있는 이유는 접근제한자가 public이기 때문이다.
		 * (그래서 보안을 위해서 캡슐화가 필요한 건가??)
		 */
		
		/* 관계
		 * Dependency(의존) <- 이것도 중요하다. 아래 예시 참고할 것.
		 */
	/*
	public void 재고확인하기(){
	    System.out.println(name+"의 현재 재고는 "+amount+"개입니다.");
	   }
	 public void 제품판매하기(){
	   amount -= 1;
	   System.out.println(name+"의 재고가 1개 줄었습니다. 현재 재고는 "+amount+"개입니다.");
	   }
	 public void 재고채우기(){
	   amount += 3;
	   System.out.println(name+"의 재고가 3개 채워집니다. 현재 재고는 "+amount+"개입니다.");
	   }
	   */
	
	private void checkAmount(){
		    System.out.println(name+"의 현재 재고는 "+amount+"개입니다.");
		   }
	private void sellProduct(){
		   amount -= 1;
		   System.out.println(name+"의 재고가 1개 줄었습니다. 현재 재고는 "+amount+"개입니다.");
		   }
	private void insert(){
		   amount += 3;
		   System.out.println(name+"의 재고가 3개 채워집니다. 현재 재고는 "+amount+"개입니다.");
		   }
	 
	public void openMachine(){
		 checkAmount();
		 sellProduct();
		 insert();
		 checkAmount();
	}

	
	public void setName(String name) { // name 필드를 수정할 수 있는 메소드
		//접근제한자 void set필드명(String 필드식별자)
		this.name = name; //좌항 name(필드)에 우항 name(전달받은 매개변수값)을 대입(=).
		System.out.println(name);
		
	}
	
	 
	public void setPrice(int price){ //public void(리턴 타입. void = 비어 있는 -> 반환할 것이 없다.) 
	/*
	 * 여기서 ()안 int price는 parameter, 매개변수.
	 * 매개변수는 메소드 호출 시 초기화가 강제됨.
	 * 스코프 안에선 지역변수가 식별자 우선권을 갖는다.  
	 */
	
	
	System.out.println(price+"원");
	//System.out.println("this is my address: "+this); // this는 해당 객체의 주소값을 가리키는 역할.
	
	this.price = price;
	
	//하나의 메소드는 하나의 기능만을 수행해야 한다. set 메소드에선 set만.
	}
	
	
	public void setAmount(int amount) { // amount 필드를 수정할 수 있는 메소드
		/* 문장 뜯어 보기
		 * public: 접근제한자 
		 * void: 반환 타입 (Return Type) = 아무 것도 반환하지 않는다 / 만약 숫자를 돌려줘야 한다면 void 대신 int라고 적어야 합니다.
		 * set필드명: 메서드명 (Method Name) = 이 기능의 이름입니다.
		 * (자료형 필드식별자): 매개변수 = 메서드가 일을 하기 위해 외부로부터 받아오는 재료
		 */
		this.amount = amount; //좌항 name(필드)에 우항 name(전달받은 매개변수값)을 대입(=).
		System.out.println("재고: "+amount+"개");
		
	}
	
	//관례 위반: 두 개 이상의 필드값을 변경하는 메소드 이름에 set이 붙으면 안 됨!!
	
		public String getName() { //네임 내놔!! set하는 방법은 다양하지만 get은 get뿐.
		//메소드를 호출한 곳으로 name필드값을 돌려주고 싶음. => return "네임필드값";
		//return "네임필드값";
		return name;
		}
		
		public int getAmount() {
			return amount;
		}
		
		/* c언어는 그냥 함수 쓴다. 하지만 자바는 객체를 지정한 뒤 함수를 불러 온다.
		 * 자바의 클래스는 자료형이고, 메소드는 특정 자료형, 특정 객체만 수행할 수 있는 기능이다.
		 * 예) 1-1은 수행할 수 있지만 '일'-'일'은 안 됨. -란 기능은 숫자 자료형만 수행할 수 있는 기능이기 때문.
		 */
		
	
	
	/*
	public void a() {
		System.out.println("나는 a");
		int b = b();
		System.out.println("b 호출");
	}
	
		
	public int b() {
		
		System.out.println("나는 b");
		int c = c();
		System.out.println("c 호출");
		return c;
	}
		
	public int c() {
		
		System.out.println("나는 c");
		System.out.println("1 남기고 방 뺀다");
		return 1;
	}
	*/
	
		public String info() {
			String info = "자판기 = [제품명: "+name +" / 가격: "+price +" / 재고: "+amount+"]";
			return info;
		}
		

}