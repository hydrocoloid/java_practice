package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {

	/*캡슐화(encapsulation) <- 중요하다!
	OOP의 4대 요소: 캡슐화, 상속, 다형성 + 추상화
	속성(데이터)과 해당 데이터를 조작하는 행동(메소드)을 하나의 단위로 묶는 것.
	정보 은닉(information hiding)이 목적.
	
	캡슐화 하기
	1) 값을 숨긴다 = 접근제한자를 private으로 수정한다.
	2) 그러면 asm.name = "삼양라면"; asm.price = 1100; asm.amount = 50;은 못 쓰게 됨.
	= 왜냐? 참조를 못하니까. -> 직접 접근이 불가능.
	3) 메소드를 통해 간접적으로 접근할 방법을 만들어줘야 함. getter와 setter.
	4) 각각의 필드들에 대한 getter(), setter()를 구현하면? 캡슐화 끝~!!
	=> 장점: 데이터를 숨김. 외부에서 이 객체에 대해 아는 점이 감소 = 객체 간 결합도가 낮아짐.
	=> 필드에 대한 수정을 이 객체가 직접 하게 만듦 -> 책임을 분리함.
	
	setter와 getter라는 메소드 구현하기
	❤️ setter(): 객체의 속성 값을 기록 및 수정하는 기능의 메소드 
	원래 VO클래스엔 setter 안 만든다. -> DTO로 우회해야 하는데 이건 나중에 배울 계획.
	
	setter 만들기 규칙
	1) 외부 메소드에서 접근이 가능해야 한다. -> 접근제한자는 public 사용.
	2) 메소명을 무조건 set으로 시작한다. ->set필드명으로 식별자를 작성하며 camelCase 사용.
	
	❤️❤️ getter(): 데이터를 반환해주는 기능의 메소드 -> 꼭 있어야 함!!
	1) set하는 방법은 다양하지만 get은 get뿐.
	2) getter()는 접근제한자 public을 사용한다.
	3) get필드명 -> camelCase로 이름 짓기.
	4) VO패키지 안에 존재하는 클래스라면 getter는 무조건 만들어야 한다!!!!
	5) getter는 일반적으로 this 붙이지 않는다. 안 붙여도 되니까.
	
	*/
	
	public static void main(String[] args) {
		
		AutoSellingMachine asm = new AutoSellingMachine();
		/*문장 뜯어 보기
		 * AutoSellingMachine asm = new AutoSellingMachine();
		 * 1)객체 생성 어떻게 해야 하냐? new 키워드를 작성한다. -> new
		 * 2) new 뒤에 생성자를 입력한다. -> new AutoSellingMachine(); =값
		 * 객체 생성 = AutoSellingMachine이란 객체가 메모리(heap)에 적재.
		 * 3) asm이란 변수에 heap영역 주소값이 대입됨.
		 
		 * asm.hi(); = asm이란 변수 공간에 대입된 주소값을 참조하여 hi()란 메소드를 호출하라.
		  
		 * new AutoSellingMachine().hi(); = 우항 new AutoSellingMachine();은 값.
		 * 1) new 키워드와 생성자를 사용하여 메모리(Heap 영역)에 새로운 객체를 만듭니다. 
		 * 2) 여기까지는 첫 번째 줄과 동일하지만, 이 주소값을 담아둘 변수(asm)가 없습니다.
		 * 3) 생성된 객체의 주소를 변수에 저장하는 과정을 생략하고, 그 즉시 점(.)을 찍어 해당 객체의 hi() 메소드에 접근합니다.
		 */
		
		//변수 공간에 대입될 수 있는 값은 딱 9가지뿐(null 제외): 기본 자료형 8개의 리터럴값 + 주소값.
		
		/*
		asm.name = "삼양라면";
		asm.price = 1100;
		asm.amount = 50;
		*/
		
		/*
		System.out.println(asm.name);
		System.out.println(asm.price);
		System.out.println(asm.amount);
		*/
		
		/*
		asm.재고확인하기();
		asm.제품판매하기();
		asm.재고채우기();
		asm.재고확인하기();
		AutoSellingMachine()의 책임이 Run()에 있던 상태
		-> 이 메소드들을 openASM()이란 클래스에 담고, Run에선 호출만 함.
		*/
		
		
		asm.setName("삼양라면");
		asm.setPrice(1500); //()안은 argument. 인자값, 인수.
				/* 문장 뜯어 보기
				 * ams이란 변수에 대입된 주소값을 참조하여,
				 * setPrice이란 메소드에게
				 * 1500이란 argument를 전달한다. 
				 */
		asm.setAmount(7);
		//new AutoSellingMachine();
		
		asm.getName();
		//System.out.println(asm.getName());
		//String name = asm.getName();
		
		asm.getAmount();
		//System.out.println(asm.getAmount());
		//int amount = asm.getAmount();
		
		
		//asm.a();
		

		// 3. info() 메소드 호출 및 출력
	    // info()는 String을 '리턴'만 할 뿐, 스스로 출력하진 않기 때문에 println에 넣어줘야 합니다.
	    String result = asm.info(); 
	    System.out.println(result);
	    
	    // 또는 한 줄로 요약 가능
	    // System.out.println(asm.info());
	
	}
	
}
