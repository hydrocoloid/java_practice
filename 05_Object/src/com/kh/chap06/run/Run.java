package com.kh.chap06.run;

import com.kh.chap06.controller.OverloadingController;

public class Run {
	
	//메소드란? 특정 객체가 수행할 수 있는 기능
	//수업에서는 실무에서 써 먹을 수 있는 코드 형태로 배울 것임.
	
	public static void main(String[] args) {
		
		//new MethodController(); //기본생성자 호출
		
		//int result = new MethodController().add(5, 4);
		//한 번만 쓰고 말 거면 이렇게 만들어라.
		//갈수록 우항은 복잡해질 것. 하지만 결국 '값'일 뿐.
		//기본자료형인가, 참조자료형인가. 그것만 생각하면 됨.
		//System.out.println(result);
		
		/*
		MethodController result = new MethodController();
		int a = result.add(1, 2);
		int b = result.add(2, 3);
		int c = result.add(a, b);
		int d = result.add(c, a);
		
		System.out.printf("%d %d %d %d", a, b, c, d);
		System.out.println();
		
		result.method1();
		result.method2();
		System.out.println(result.method2());
		
		int e = result.method4(46);
		System.out.println(e);
		*/
		
		OverloadingController oc = new OverloadingController();
		//정적 바인딩(Static Binding) -> 컴파일이 끝난 시점에 어떤 메소드가 호출될 지 결정.
		//컴파일러가 알아서 코드를 분석하여 메소드 호출 결정.
		oc.method(); 
		oc.method(30); //메소드 호출 시에 인자값을 정수형으로 입력해줘야 함.
		oc.method("str");
		oc.method(3, 4); //값(아규먼츠)을 전달한다, 
		
		System.out.println();
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('1');
		System.out.println("1");
		//이게 바로 오버로딩 -> 메소드명은 같다. 매개변수 자료형은 다 다르다.
		
		//static, dynamic, automatic: 정적, 동적, 자동 한 세트.
		
	}

}
