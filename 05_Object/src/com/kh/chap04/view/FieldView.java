package com.kh.chap04.view;

import com.kh.chap04.controller.FieldController;

public class FieldView {

	public void check() {
		
		FieldController fc = new FieldController();
		//1. FieldController라는 자료형으로 fc라는 지역변수를 선언.
		//2. 객체 생성함 = new (-> global이란 멤버변수 할당.)
		//new는 말 그대로 새로운(New) 무언가를 메모리에 올리겠다는 명령어입니다.
		//역할: 컴퓨터의 메모리(Heap 영역)에 이 객체가 들어갈 실제 공간을 확보합니다.
		//이 녀석은 이름 뒤에 소괄호()가 붙어 있죠? 이건 생성자(Constructor)라는 특별한 함수입니다.
		//역할: new가 파놓은 빈 땅에 클래스 설계도대로 내용물을 채우고 초기화합니다.
		//3. 생성된 객체의 주소값을 대입.
		
		
		System.out.println(fc.global);
		// System.out.println(fc.local); <- 메모리에 안 올라가서 못 씀.
		
		// fc.checkVariable(); <- 초기화 필요
		fc.checkVariable(5); // int parameter에 대한 초기화.
		
		// -> fc.checkVariable(5); 메소드 종료.
		// -> parameter, local 지역변수 소멸.
		// -> 하지만 필드부 global은 힙 영역에 살아 있음. 
		System.out.println(fc.global);
		fc = null; //힙 영역의 주소를 가리키는 fc의 변수를 날려 버림.
		//System.out.println(fc.global);
		
	}
	
}
