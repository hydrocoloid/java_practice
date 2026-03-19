package com.kh.array;

import java.util.Arrays;

public class Array {
	
	/* 변수와 배열
	  
	 * 변수: 메모리(RAM)에 DATA(VALUE)값을 저장하는 공간.
	 * (변수의 특징: 자료형이 정해져 있다. 고유한 식별자를 가짐. 자료형은 크기가 정해져 있다. 새로운 값을 대입해서 쓸 수 있다. 선언된 scope 안에서만 사용할 수 있다. 등 등.)
	 * 하나의 변수 공간에는 하나의 값만 대입될 수 있다.
	  
	 * 배열(Array): 자료 구조. 
	 * 배열의 특징: 하나의 배열에 여러 개의 값을 담을 수 있다. 단, 같은 자료형의 값들만. 동종모음(homogeneous collection).
	 * 배열이란? 변수의 나열. 논리 구조와 물리 구조가 동일하다. = 메모리에 넣은 배열의 값이 순차적으로 들어가고, index값을 순차적으로 꺼낼 수 있다?
	 * index: 배열의 각 공간에 접근할 때 사용하는 개념. 0부터 시작한다. 
	 
	 * 배열 선언
	 * 1) 자료형 배열명[];
	 * 2) 자료형[] 배열명;
	 * ex) 변수 선언: int num; / int[] num;
	 
	 * 초기화(값 대입)
	 * ex) 변수 초기화: int num = 1; (가능) / int[] nums = 1 (불가능 -> int형 배열에 int형 리터럴값을 넣으려고 해서 생기는 문제);
	 * => 배열은 대입이 아니라 할당! 
	 * 배열은 참조자료형이다
	 
	 * 배열 할당: 배열에 몇 개의 값이 들어갈 것인지 배열의 크기를 정해주는 과정
	 * 지정한 개수만큼의 값이 들어갈 공간이 할당됨.
	 
	 * 표현식
	 * int[] nums; <= 배열 선언
	 * nums = new int[5];  <= 배열 할당
	 * int[] arr = new int[5]; <= 배열 선언과 동시에 할당.
	 
	 * 배열은 아주 중요하다. 하지만 취직 후에 중요하다.
	 */

	public void method1() {
		/*목표: 다섯 개의 정수를 변수에 대입한 뒤 정수값을 모두 더한 값을 출력.
		int num1 = 1; int num2 = 2; int num3 = 3; int num4 = 4; int num5 = 5;
		int sum = num1+num2+num3+num4+num5;
		System.out.println(sum); */
		
		int[] nums = new int[2];
		
		/*
		int[] nums = new int[2]; 를 실행했을 때 생기는 일
		
		내가 이해한 게 맞을까?
		static - stack - heap
 		static: 메인 메소드 호출 -> array.method1();
		stack: method1()이란 메소드 공간이 할당됨. -> int[] nums = new int[2]; -> 스택에 nums라는 공간(주소 적을 칸)이 할당됨.
		heap: int형 2칸 공간이 할당됨. 
 		nums: new int[2]가 있는 주소값이 들어 감.
 		index: 순서를 부르는 명칭. (편의상 Heap에 만들어진 int형 2칸에 붙은 방 번호라고 생각하자).
		*/
		
		//배열에 값을 대입하자.
		nums[0]=10;
		nums[1]=20;
		
		//
		/*취직 꿀팁 
		 *1) 취직시 코딩테스트 한다면? collection, string, array 중에서 문제 나올 가능성 높음.
		 *2) 정보처리기사 따라. 응시자격이 된다면 반드시 따라.
		 *3) 외국어점수도 있으면 좋다.
		 *4) 세미프로젝트 진행 이후엔 대회 참가를 많이 하는 게 좋다. 해커톤대회. (아이디어 싸움, 발표 싸움.)
		 */
		
		/*
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[0]+nums[1]);
		*/
		
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			sum += nums[i];
		}
		System.out.println("배열 요소의 합계는? "+sum);
	}
	
	
	public void method2() {
		
		/* 배열 선언 및 할당
		 * 변수는 선언하면 끝. int i;
		 * 배열은 반드시 할당을 해줘야 한다. heap 영역에 얼마큼의 공간이 필요한데? 
		 * int[] integers = new int[3] => int 크기 3칸만큼. (index는 0, 1, 2.)
		 
		 * 배열식별자.length: 배열의 크기(길이) -> 정수 
		 */
		
		//System.out.println(i);
		//지역변수(local variable): 초기화를 하지 않으면 사용할 수 없음.
		
		/*
		System.out.println(integers[0]);
		System.out.println(integers[1]);
		System.out.println(integers[2]);
		//초기화를 안 해도 0이 뜨는 이유? heap 영역은 비어 있을 수 없음. int면 0이 들어감.
		*/
		
		//기본자료형은 변수 공간에 실제 값을 바로 담을 수 있음. -> byte, short, int, long, float, double, boolean, char. 
		//참조자료형: 변수 공간에 주소 값을 담을 수 있음. -> int[], boolean[], char[], ... , String[] 등 등..
		
		/* 비유
		 * kh종로점의 501 강의실로 가야 함. 
		 * kh종로점의 주소는 "서울시 종로구 어쩌고길 00". kh종로점은 이름에 불과.
		 * 서울시 종로구 어쩌고길 00에 간 뒤 501 강의실로 가야 돼.
		 
		 * String[] KH종로점 = new String[5]; <- 5개 강의실 중 하나.
		 * KH종로점[0] = 301강의실;
		 * KH종로점[1] = 302강의실;
		 * KH종로점[2] = 501강의실;
		 * KH종로점[3] = 502강의실;
		 * KH종로점[4] = 사무실;
		 
		 * String[] KH종로점 = new String[5]; => heap 영역에 5칸이 생김. 
		 * 칸의 주소는 "서울시 종로구 어쩌고길 00 대왕빌딩" -> stack 영역에 생긴 KH종로점이란 공간에는 칸의 주소만 담김.
		 * 각 칸을 구분하는 호칭이 index.
		 */
		
		/*
		int i;
		int[] integers = new int[3];
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);
		*/
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2);
		System.out.println(numbers1);
		System.out.println(numbers2);
		
		/*참조자료형의 경우 == 사용 시, 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음. 
		//-> 그래서 String은 ==이 아니라 equals란 메소드를 이용해야 함. 
		문자열.equals("비교할 문자열");
		*/
		
		//주소는 16진수로 표현됨. -> 10진수로 바꾸는 방법: hashCode 이용.
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
		
	}
	
	public void lottoGeneratorVerTwo() {
		
		/*
		int num1 = (int)(Math.random()*45+1);
		int num2 = (int)(Math.random()*45+1);
		int num3 = (int)(Math.random()*45+1);
		int num4 = (int)(Math.random()*45+1);
		int num5 = (int)(Math.random()*45+1);
		int num6 = (int)(Math.random()*45+1);
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
		*/
		
		int[] numbers = new int[6];
		for(int i = 0; i<6; i++) {
		numbers[i] = (int)(Math.random()*45+1);
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	
	public void method3() {
		//구구단을 담는 9칸짜리 배열을 선언 및 할당해보자.
		String[] gugudan = new String[9]; //1. 배열 선언 및 할당
		
		/*
		gugudan[0] = "2X1=2";
		gugudan[1] = "2X2=4";
		gugudan[2] = "2X3=6";
		*/
		
		for(int i = 0; i<gugudan.length; i++) {
		gugudan[i] = "2X" + (i + 1) + "=" + (2 * (i + 1));
		}
		System.out.println(Arrays.toString(gugudan));
		
		//ai 써서 코드 고칠 때: 현재 나의 상황(자바 공부한지 5일차)과 피드백의 주체(1년차 주니어 개발자)를 명확하게 설정해서 질문하라.
	}
	
	
	public void method4() {
		
		char[] love = new char[4]; 
		love[0] = 'l'; love[1] = 'o'; love[2] = 'v'; love[3] = 'e';
		System.out.println(Arrays.toString(love));
		love[1] = 'i';
		System.out.println(Arrays.toString(love));
		love = new char[5];
		//love[4] = 'r';
		System.out.println(Arrays.toString(love));
		love = null;
		System.out.println(Arrays.toString(love));
		
		/* 
		 * 1) l, o, v, e는 단일문자이므로 char[]. 배열명은 간단히 love.
		 * 2) love라는 char 배열에 칸 수는 4칸으로 만들어 주자. -> char[] love = new char[4]; 
		 * 3) char[] love = new char[4]; -> heap에 4칸이 생김. stack에 love란 공간이 생기고 heap주소가 담김.
		 * 4) love 뒤에 []로 index를 지정하고, 대입함. -> love[0] = 'l'; love[1] = 'o'; love[2] = 'v'; love[3] = 'e';
		 
		 여기서 love = new char[5];를 넣으면?
		 5) 새로운 5칸이 생기고 각 칸에는 char형의 기본값인 ' '이 대입됨.
		 *기본값: char = ' ' / int = 0 / float = 0.0
		 6) stack에 있는 love란 공간에 새로 생긴 5칸의 주소가 담김.
		 7) System.out.println(Arrays.toString(love)); -> 빈 문자들만 출력됨.
		 즉) 한 번 할당받은 배열의 크기를 변경할 수 없음.
		 
		 그러면 원래 만들었던 4칸은 어떻게 되느냐?
		 8) 날려버려야 한다. -> GarbageCollection(GC)이 RC0(레퍼런스 카운드 0)인 친구를 자동삭제함. = 자바의 자동 메모리 관리.
		 즉) 기존배열식별자에 할당만 새롭게 한다면 (love = new char[5];) -> 기존 참고하고 있던 연결이 끊기고 새로운 배열을 가리킴.
		 9) 그런데 GC는 사용자가 구동하는 게 아니라 jvm이 구동시킴. 
		 
		 배열에 들어갈 수 있는 값은 주소값뿐.
		 char형 배열에 들어 갈 수 있는 타입은 char형 배열 타입뿐. (원칙: 좌항과 우항의 자료형이 같아야 변수 공간에 값을 대입할 수 있다.) 
		 유일한 예외는 null값. null값은 주소값을 대체할 수 있다.
		 null: 아무 것도 존재하지 않음을 의미하는 값.
		 */
	}
	
	public void method5() {
		
		/* 그래서 배열은 언제 쓰는가? 사용해야 하는 값과 개수가 명확한 경우에만 사용.
		 * 웹으로 한정한다면? 임시 비밀번호 발급. 인증코드 발급.
		 * 배열의 한계를 보완하는 좋은 친구들이 많기 때문에 개발할 때 배열을 많이 쓰진 않음. (간접적으로는 많이 사용하고 있음.)
		 
		 *사용한다면 직접 인덱스에 값을 대입하는 방식보다는
		 *int[] arr = {100, 200, 300}; System.out.println(Arrays.toString(arr)); 같은 방식으로 사용함.
		 
		 *배열 복사: 얕은 복사 / 깊은 복사
		 *1) 얕은 복사(변수/자료형 이후 가장 중요한 내용!!): 
		 *2) 깊은 복사
		 */
		
		/*
		int[] arr = {100, 200, 300}; <= 요소(elements)
		System.out.println(Arrays.toString(arr));
		*/
		
		/*int[] origin = new int[3];
		 * origin[0] = 1; origin[1] = 2; origin[2] = 3; 
		 * => int[] origin = {1, 2, 3};
		 */
		
		/*얕은 복사: 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같다.
		int[] origin = {1, 2, 3};
		System.out.println(Arrays.toString(origin)); 
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		*/
		
		//깊은 복사: 보콩 기존 배열의 크기보다 더 큰 배열로 복사하는 경우가 많음. 더 큰 배열을 만들어서 데이터를 사용하겠다는 목적.
		int[] origin = {1, 2, 3};
		System.out.println(Arrays.toString(origin));
		int[] copy = new int[6];
		System.out.println(Arrays.toString(copy));
		
		/*
		for(int i=0; i < origin.length; i++) {
			copy[i]=origin[i];
		}
		System.out.println(Arrays.toString(copy));
		*/
		
		int[] copy2 = new int[10];
		//클래스와 인터페이스는 첫 글자가 대문자로 시작한다. System, String, Scanner.
		System.arraycopy(origin, 1, copy2, 7, 2);
		//System.arraycopy(원본배열명, 원본에서 복사할 인덱스, 카피배열명, 카피배열에서 복사될 인덱스, 복사요소개수);
		System.out.println(Arrays.toString(copy2));
		
		int[] copy3 = Arrays.copyOf(origin, 15); // <- 15= 새롭게 만들 배열의 칸 수
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
		
	}
	
	
}
