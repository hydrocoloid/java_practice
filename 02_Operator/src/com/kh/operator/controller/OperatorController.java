package com.kh.operator.controller;

import java.util.Scanner;
//import java.util.InputMismatchException; // 예외 처리를 위한 import

public class OperatorController {
	
	public void arithmetic() {
	
		/*산술연산자: +, -, *, /
		 * 우선순위가 좌로부터 우로. *, /이 +, -보다 우선.
		 * %: 모듈러(Modular) 연산 = 나눗셈에서의 나머지를 구하는 연산.
		
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("num1 + num2 : " + num1 + num2);
		//"num1 + num2 : 103" >?????
		
		//해결 방법1
		System.out.println("num1 + num2 : " + (num1 + num2));
		//해결 방법2
		int sum = num1 + num2;
		System.out.println("num1 + num2 : " + sum);
		//해결 방법3
		System.out.print("num1 + num2 : ");
		System.out.println(num1 + num2);
		//해결 방법4
		System.out.printf("num1 + num2 : %d%n", num1 + num2);
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 X num2 : " + (num1 * num2));
		System.out.println("num1 ÷ num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		 */
	}

	public void print() {
		
		System.out.println("메인 메소드 아니어도 출력 가능.");
		
	}
	
	/* 사탕 개수 구하기 프로그램 만들어 보자.
	 * 메소드: presentToStudent()
	 * 사용자에게 값을 입력 받으세요. = Scanner
	 * 나눠 줄 학생의 수를 nextInt() 메소드로 받고
	 * 사탕 개수도. 
	 * 1인당 받을 수 있는 사탕의 개수: 사탕 개수 / 학생 수 
	 * 남은 사탕의 개수: 사탕 개수 % 학생 수 
	 * 출력
	 * 학생 한 명당 받을 수 있는 사탕 개수 X개
	 * 남은 사탕 개수: X개
	 */
	
	/*
	public void presentToStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력해주세요 > ");
		int studentNumber = sc.nextInt();
		//System.out.println("학생은 " + studentNumber + "명입니다.");
		
		System.out.print("가지고 있는 사탕의 총 개수를 입력해주세요 > ");
		int candyNumber = sc.nextInt();
		//System.out.println("사탕은 총 " + candyNumber + "개입니다.");
		
		System.out.println("1인 당 받을 수 있는 사탕은 " + (candyNumber/studentNumber) + "개입니다.");
		System.out.println("남는 사탕의 개수는 " + (candyNumber%studentNumber) + "개입니다.");
		/*int result = candyNumber/studentNumber
		 * int mod = candyNumber%studentNumber
		 * System.out.println("1인 당 받을 수 있는 사탕은 " + result + "개입니다.");
		 * System.out.println("남는 사탕의 개수는 " + mod + "개입니다.");
		
		sc.close(); //스캐너 종료.
		
	}
	*/
	
	/*
	public void inDecrease() {
		
		 //증감연산자: 단항연산자로 한 번에 1 증가하거나 1 감소하는 연산을 함. ++, --.
		 //증감을 먼저 할 건지, 나중에 할 건지에 따라 연산자의 위치가 달라짐: 전위연산, 후위연산.
		 //전위연산: ++값, --값 => 먼저 값을 증감시킨 후 작업을 처리함.
		 // 후위연산: 값++, 값-- => 먼저 값을 처리하고 나서 증감.
		
		int num = 10;
		System.out.println(num); //10
		num++; //10+1=11
		System.out.println(num); //11
		num--; //11-10=10
		System.out.println(num); //10
		
		System.out.println(num++); // 10 -> 출력 후 num값에 +1 되어 11
		System.out.println(num++); // 11(위 문장에서 increase된 값) -> 출력 후 num값에 +1 되어 12
		System.out.println(num); // 12(위 문장에서 increase된 값)
		
		//코드에서 num++와 같이 연산자가 뒤에 붙는 방식을 **후위 연산자(Post-increment)**라고 합니다.
		//가장 중요한 규칙은 **"먼저 사용(출력)하고, 나중에 값을 증가시킨다"**는 것입니다.
		*/
		
		
		/*
		int num = 10;
		int number = num++;
		System.out.println("num : " + num);
		System.out.println("number : " + number);
		//순차적 해석
		 * int num = 10;
		 * 1) num이란 식별자를 가진 int형 변수 공간을 할당
		 * 2) 정수형 리터럴 값 10
		 * 3) 대입
		 * int number = num++;
		 * 4) number란 식별자를 가진 int형 변수 공간을 할당
		 * 5) num이란 변수 공간에 담긴 리터럴값(10)을 가져 옴.
		 * 6) ++: num이란 변수공간의 값을 1 더함. =num에 1을 더해 number가 채워지는 게 아니라 num이란 공간에 담겨 있는 정수가 1 더해지는 것. number와는 무관.
		 * 7) 가져 온 리터럴값을 number라는 변수 공간에 초기화. 
		*/
	
		/*
	int a = 20;
	int b = a--;
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	
	int c = 20;
	int d = c++*3;
	System.out.println("c : " + c);
	System.out.println("d : " + d);
	
	int e = 10;
	int f = ++e;
	System.out.println("e : " + e);
	System.out.println("f : " + f);
	
	int g = 20;
	int h = ++g*3;
	System.out.println("g : " + g);
	System.out.println("h : " + h);
	}
	*/
	
	
	/*
	public void compound() {
		 = 대입연산자
		 * 산술연산자에 대입연산자를 합친 연산자: 복합 대입 연산자
		 * 자신과 해당 산술연산을 수행한 후 그 결과를 자신에게 다시 대입.
		
		
		int endDay = 128;
		System.out.println(endDay);
		endDay = endDay - 1; // => endDay -= 1; 동일함.
		System.out.println(endDay);
		endDay -= 1;
		System.out.println(endDay);
		
	}
	 */
	
	/*
	public void logicalNagation() {
		
		 *논리 부정 연산자: 논리값(t/f)을 반대로 바꿔 주는 연산자 !, !!!	
		
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!!!true);
	}
	 */
	
	/*
	public void comparison() {
		//관계연산자(비교연산자): 두 개의 값을 가지고 비교하는 이항 연산자
		//비교연산자(==): 좌우항의 값을 비교하여 결과값을 반환.
		//비교연산을 한 결과: t/f
		//특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 것.
		
		//동등비교: 같다, 같지 않다.
		//a == b: 의문형으로 해석해야 함. a와 b가 같니? -> 대답: t/f
		//a != b: a와 b가 일치하지 않습니까? 
		
		//대소비교: 크다, 작다.
		//a < b: a가 b보다 작습니까?
		//a > b: a가 b보다 큽니까?
		//a <= b: a가 b보다 작거나 같습니까?
		//a >= b: a가 b보다 크거나 같습니까?
		
		int firstNumber = 10;
		int secondNumber = 25;
		//System.out.println("10=25? " + (firstNumber == secondNumber));
		
		System.out.println("firstNumber는 짝수입니까?");
		//true가 출력되도록 연산해야 함.
		//나는 무슨 값을 가지고 연산을 해야 하는가? firstNumber
		//무슨 연산을 해야 하는가? 비교연산
		//짝수 특: 2의 배수임. = 2로 나눴을 때 나머지가 0과 같음.
		System.out.println(firstNumber % 2 == 0);
	}
	*/
	
	/*
	public void logical() {
		//논리 연산자: 두 개의 논리값을 연산하는 연산자.
		//논리값 논리연산자 논리값 => 논리값
		
		//1) AND 연산자: 논리값 && 논리값 (&: 앰퍼샌드) => 좌우항 값이 모두 true여야 최종결과값이 true
		 * 왼쪽이 false면 오른쪽은 계산 안 함. ex) boolean result = false && (num % 2 == 0);
		//2) OR 연산자: 논리값 || 논리값 (|: 버티컬 바/파이프 ) => 좌우항 값 둘 중 하나라도 true면 최종결과값이 true
		
		//계획
		//1. 사용자에게 한 개의 정수값을 입력 받음.
		//2. 입력한 정수 값이 0보다 크면서 짝수인지 연산
		//3. 그리고 결과를 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("짝수판별기");
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		boolean result = (num > 0) && (num % 2 == 0);
        
        System.out.println("결과: " + result);
        System.out.println("(결과가 true면 짝수, false면 홀수입니다.)");
        
        sc.close();
	}
	*/
	
	/*
	public void andOper() {
		//사용자에게 정수값을 입력 받아서, 입력 받은 정수값을 변수에 대입한 뒤, 콘솔창에 출력.
		
		System.out.println("---1과 10 사이---");
		System.out.println("1과 10 사이의 수를 찾아드립니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		
		boolean result = num >= 1 && num <= 10;
		// boolean result = 1 <= num && num <= 10;
		System.out.println("결과: " + result);
		
		조건문 사용
	    if (num > 5) {
	        // 조건이 true일 때 실행
	        System.out.println("5보다 큽니다.");
	    } else {
	        // 조건이 false일 때 실행
	        System.out.println("5보다 작거나 같습니다.");
	    }
	   
		sc.close();
	}
	*/
	
	public void orOper() {
		//사용자에게 한 글자 입력 받아서 A인지 a인지 확인해서 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("'꼭' 한 글자만 입력하세요 > ");
		
		char letter = sc.nextLine().charAt(0);
		//index는 0부터 시작.
		
		//1. 무슨값을 가지고 연산할 것인가: letter, a, A.
		//2. 무슨 연산을 할 것인가: 동등연산 ==
		//3. char형이 int형으로 자동형변환이 일어난 뒤 연산
		boolean result = (letter == 'a') || (letter == 'A');
		System.out.println("사용자가 입력한 한 글자는 알파벳 a거나 A인가요? " + result);
		
		sc.close();
		
	}
	
	public void triple() {
		
		//삼항 연산자: 피연산자가 3개. => 3개의 값과 1개의 연산자로 구성. 조건문의 형식으로 쓰임.
		//조건식? 조건식이 true일 경우 결과값: 조건식이 false일 경우 결과값.
		//조건문? 값에 따라 연산을 처리하는 방식. 결과값이 true일 경우 첫 번째 문장 처리. 결과값이 false일 경우 두 번째 문장을 처리.
		
		System.out.println("깐부치킨에 오신 것을 환영합니다.");
		System.out.println("1. 회장님의 입맛 그대로 AI치킨");
		System.out.println("2. 바삭한 식스팩 치킨");
		System.out.println("3. 치킨의 근본 후라이드 치킨");
		
		Scanner sc = new Scanner(System.in);
		//Ctrl+Shift+o = 임포트 자동완성 단축키
		
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		//1번을 입력하면? 회장님의 입맛 그대로 AI치킨을 주문하셨습니다.
		//2번을 입력하면? 바삭한 식스팩 치킨을 주문하셨습니다.
		//3번을 입력하면? 치킨의 근본 후라이드 치킨을 주문하셨습니다.
		//1번, 2번, 3번이 아니면? 없는 메뉴를 주문하셨습니다.
		//System.out.println(menuNo);
		
		String selected = menuNo == 1 ? "회장님의 입맛 그대로 AI치킨을 주문하셨습니다."
						: menuNo == 2 ? "바삭한 식스팩 치킨을 주문하셨습니다."
						: menuNo == 3 ? "치킨의 근본 후라이드 치킨을 주문하셨습니다."		
						: "없는 메뉴를 주문하셨습니다.";
		
		System.out.println(selected);
		
		sc.close();
		
	}
	
}
