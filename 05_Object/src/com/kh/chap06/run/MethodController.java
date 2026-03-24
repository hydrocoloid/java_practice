package com.kh.chap06.run;

public class MethodController {

	/* 메소드(Method): 멤버 함수
	 * 프로그래밍 언어에서의 함수: 특정 작업을 수행하기 위해서 만들어진 코드 블록.
	 * 1. 재사용성
	 * 2. 모둘화
	 * (나만의 함수 뭉치를 만들어서 들고 다니는 개발자들도 있다.)
	 * 
	 * 객체 지향 프로그래밍에서의 함수(메소드): 객체가 수행할 수 있는 행동을 정의한 코드 블록.
	 * = 특정 자료형에서만 사용이 가능한 함수
	  
	 * [표현법]
	 * 접근제한자 (예약어) 반환형 메소드식별자(매개변수의_자료형 매개변수_식별자){
	  	수행할 코드;
	  	return 반환값;
	  	}
	  	method signature{method body}
	  	
	 * 생략 가능한 것: 예약어, 매개변수, return문(void일 경우)
	 * 반환형: return시 반환할 값이 있을 경우 반환할 값의 자료형
	 * 메소드 호출시 전달 인자값 => 매개변수의 자료형 및 개수가 정확하게 일치해야 함.
	 */
	
	//정수값 두 개를 받아서 더하기 결과를 반환해주는 기능을 만들고 싶다.
	
	public int add(int a, int b) { 
		return a+b; //반환값
		
	}
	
	//1. 매개변수 x, 반환값 x
	public void method1() { //메소드를 이렇게 만들 땐 보통 출력용이다.
		System.out.println("출력용 메소드");
	}
	
	
	//2. 매개변수 x, 반환값 o
		public String method2() { 
			return "필드값"; //자바에선 메소드를 반환할 수 없다. 필드값만 반환해줄 수 있다.
		}
		
		public String method3() { 
			return method2(); //자바에선 메소드를 반환할 수 없다. 필드값만 반환해줄 수 있다.
			//자바에서 중요한 건 자료형과 값.
		}
		
		/*3. 매개변수 o, 반환값 x
		public void setName(String name) { 
			this.setName = name;
		}
		*/
		
		//4. 매개변수 o, 반환값 o
		public int method4(int num) { 
			return num + 54;
		}
}
