package com.kh.chap01.abstraction.model.vo;

/* public class 클래스식별자{
   클래스 내의 세 개 영역 
   1) 필드부
   2) 생성자부
   3) 메소드부
   }
 */

public class Puppy {
	
	/* [필드부]
	 * 변수를 메소드 영역 내에 선언하지 않고 메소드 밖 클래스 영역에 선언하면 필드.
	 * 식: 접근제한자 자료형 필드식별자;
	 * 접근제한자: 이 필드에 접근할 수 잇는 접근 권한을 제어하는 역할. public > protected > default > private
	 * 클래스 내부에 필드를 선언할 때는 반드시 접근제한자를 붙일 것!!
	 */
	
	/* 배열은 같은 자료형만 담을 수 있다.
	 * 필드엔 여러 자료형을 같이 담을 수 있다.
	 */
	
	public String name; // 강아지의 이름을 저장할 필드.
	public String species; // 강아지의 종을 저장할 필드.
	public String gender; // 강아지의 성별을 저장할 필드.
	public int weight; // 강아지의 몸무게를 저장할 필드.
	public int age; // 강아지의 나이를 저장할 필드.
	
	/* 현실 세계의 강아지 => 자바세상의 객체로 구현해보자.
	 종: 푸들, 이름: 나폴레옹, 나이: 5, 몸무게: 8, 성별: 암컷.
	 객체의 구성 요소는 member.
	 */
	
	/* [생성자부] 
	 * 
	 */
	
	
	/* [메소드부] = Puppy가 수행할 수 있는 행위(기능)를 구현하는 공간
	 * 
	 * 
	 */
	
	
	public void bark() { //bark메소드 입장에서 name은 같은 클래스 내부의 name 필드에 들어 있다.
		
		    System.out.println(name + "이(가) 멍멍! 하고 짖습니다.");
		}
		
	
	public void sit() { 
		/* 행위를 통해 속성을 변화시킬 수 있는가.
		 * 
		 */
		
		weight--;  // weight -= 1; 이나 weight = weight -1; 같아!
		System.out.println("체중이 1kg 감소하여 현재 체중: "+weight+"kg입니다.");
	}

}
