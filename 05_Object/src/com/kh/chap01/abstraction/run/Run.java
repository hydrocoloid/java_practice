package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.view.PuppyCare;

public class Run {

	public static void main(String[] args) {
		
		/*
		Puppy puppy = new Puppy();
		
		 new는 객체를 생성하는 예약어
		 new Puppy(); -> heap 영역에 공간이 생김.
		 -> 공간에 다섯 개의 칸이 생김. name, species, gender, weight, age 등.
		 -> Puppy 타입의 puppy 변수 공간에 heap 영역의 주소값을 대입함.
		 -> 메인 메소드가 닫힐 때가지 heap 영역의 공간은 사라지지 않음.
		 (= 누구도 주소값을 가리키지 않으면 GC가 수거해 간다.)
		 
		 puppy의 이름을 출력해보자.
		 -> System.out.println(puppy); = heap 영역의 주소값이 출력됨.
		 -> System.out.println(puppy.); = heap에 있는 공간에 .뒤에 적힌 영역을 참조하라.
		 -> System.out.println(puppy.name); = puppy의 heap 공간의 name칸에 있는 값을 출력하라.
		
		 System.out.println("---필드 채우기 전---");
		 System.out.println(puppy);
		 System.out.println(puppy.name);
		 //참조자료형은 기본값이 null. null은 아무 것도 없음을 의미.
		 
		 puppy.name = "나폴레옹";
		 puppy.species = "푸들";
		 puppy.gender = "암컷";
		 puppy.weight = 8;
		 puppy.age = 5;
		 
		 System.out.println("---필드 채운 후---");
		 System.out.println(puppy.name);
		 System.out.println(puppy.species);
		 System.out.println(puppy.gender);
		 System.out.println(puppy.weight);
		 System.out.println(puppy.age);
		 
		 System.out.println("---새로운 강아지---");
		 Puppy khan = new Puppy(); // Puppy = 자료형, khan = 식별자. Puppy khan = 변수 선언.
		 khan.name = "징기스칸";
		 khan.weight = 25;
		 //System.out.println(khan.name);
		 
		 bark()를 부르려면?
		 1) bark()의 주소를 알아야 한다.
		 2) bark()의 주소는 puppy에 담겨 있다.
		 = Puppy puppy = new Puppy();
		 3) puppy를 호출하고 참조연산자를 찍고 
		 4) bark()라는 메소드를 호출한다.
		 5) puppy.bark();
		 
		 System.out.println("\n---bark 메소드가 생성되었습니다.---");
		 System.out.println("멍멍!");
		 System.out.println(name + "이가 멍멍!");
			
		 puppy.bark();
		 System.out.println(puppy.name + "(이)가 멍멍!");
		 System.out.println(khan.name + "(이)가 멍멍!");
		 
		 System.out.println(puppy.name+"의 몸무게는 "+puppy.weight+"kg입니다.");
		 System.out.println(khan.name+"의 몸무게는 "+khan.weight+"kg입니다.");
		 
		 puppy.sit();
		 puppy.sit();
		 khan.sit();
		 khan.sit();
		 khan.sit();
		 System.out.println(puppy.name+"의 몸무게는 "+puppy.weight+"kg입니다.");
		 System.out.println(khan.name+"의 몸무게는 "+khan.weight+"kg입니다.");
		 */
		 
		PuppyCare pc = new PuppyCare();
		/*문장 뜯어 보기
		 * PuppyCare pc; -> 변수 선언 (PuppyCare = 자료형, pc = 식별자 / 변수 이름)
			new PuppyCare(); -> 객체 생성 -> 주소가 생김
			= -> pc라는 변수에 PuppyCare의 heap 영역 주소가 대입됨.
			(참조.가 아니니까 헷갈리지 말자.)
		 */
		
		pc.run();
		/*문장 뜯어보기
		  pc. -> pc라는 변수에 대입된 PuppyCare의 heap 영역 주소에서
		  run(); -> run이라는 메소드를 호출하라.
		  */ 
	}

}
