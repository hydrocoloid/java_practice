package com.kh.second;

public class Run {
	
	public static void main(String[] args)  {
		
		/*
		 * PrintMyName();
		 * 외부 클래스에 존재하는 메소드 호출하기?
		 * 먼저 메소드가 존재하는 클래스를 생성(new).
		 * "클래스 이름" "별칭" = new "클래스 이름"()
		 */
		PrintController pc = new PrintController();
		pc.printMyName();
		// . = 참조연산자, 직접접근연산자
	}

}
