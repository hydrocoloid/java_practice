package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {
	
	//사용자에게 강아지의 정보를 입력 받아서
	//입력 받은 강아지의 정보를 출력해주고
	//강아지와 함께 놀아 줄 수 있는 프로그램을
	//개발해보자.
	
	public void run() {
		System.out.println("🐶강아지 다마고치입니다~🐶");
		Scanner sc = new Scanner(System.in);
		/*문장 뜯어 보기
		 * Scanner sc: 스캐너 타입의 변수 선언 = 스캐너 객체를 힙 영역에 생성.
		 * = new Scanner(System.in);: ->스캐너 객체의 주소값을 스캐너 타입의 변수값에 대입.
		 */
		
		//sc.nextInt();
		//메소드를 호출하기 위한 전제조건은 heap영역에 올라가 있어야 한다.
		//클래스는 틀에 불과. 객체를 생성해야 의미가 있는 것.
		
		
		/* 순차적으로 생각해보자.
		 
		 * 데이터를 변수에 저장하기.  
		 * String name = sc.nextLine(); String species = sc.nextLine(); String gender = sc.nextLine(); int age = sc.nextLine(); int weight = sc.nextLine();
		 
		 * 데이터를 배열에 저장하기.
		 * String[] puppyString = new String[3]; puppyString[0] = sc.nextLine(); puppyString[1] = sc.nextLine(); puppyString[2] = sc.nextLine();
		 * int[] puppyInt = new int[2]; puppyInt[0] = sc.nextLine(); puppyInt[1] = sc.nextLine();
		 
		 * 데이터를 클래스에 저장하기.
		 * Puppy puppy = new puppy();
		 * public String name; public String species; public String gender; public int weight; public int age; .
		 */
		
		Puppy puppy = new Puppy();
		
		System.out.print("강아지 이름이 뭐예요? > ");
		puppy.name = sc.nextLine(); 
		System.out.print("강아지 종이 뭐예요? > ");
		puppy.species = sc.nextLine(); 
		System.out.print("암컷이에요, 수컷이에요? > ");
		puppy.gender = sc.nextLine(); 
		System.out.print("몇 살이에요? > ");
		puppy.age = sc.nextInt(); 
		System.out.print("강아지 몇 kg이에요? > ");
		puppy.weight = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("❤️❤️❤️");
		System.out.println(puppy.name+"의 정보"); //puppy라는 변수에 대입된 주소를 참조하여 name이란 필드에 대입된 값을 불러 와서 "의 정보"란 문자열과 더하여 출력하라.
		System.out.println("나이: "+puppy.age+"살");
		System.out.println("성별: "+puppy.gender);
		System.out.println("종: "+puppy.species);
		System.out.println("체중: "+puppy.weight+"kg");
		System.out.println("❤️❤️❤️");
		
		
		while(true) {
			System.out.println("메뉴를 선택해주세요 > ");
			if(puppy.weight >10) {
				System.out.println("*운동을 위해 앉기를 추천드립니다~*");
			}
			System.out.print("짖기 / 앉기 / 프로그램 종료 > ");
			String menu = sc.nextLine();
			//sc.nextLine(); = 개행문자가 출력되는 불상사를 막기 위한 장치. nextInt 아래 위치.
			
			switch(menu) {
			case "짖기": puppy.bark(); break;
			case "앉기": puppy.sit(); break;
			case "프로그램 종료": System.out.println("이용해주셔서 감사합니다🐶"); return;
			default: System.out.println("메뉴를 다시 선택해주세요~");
			}
			
			
			//System.out.println("❤️❤️❤️");
			//break;
			
			sc.close();
			
		}
		
		
	}

}
