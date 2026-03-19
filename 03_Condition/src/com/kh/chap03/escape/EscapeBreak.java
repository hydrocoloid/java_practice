package com.kh.chap03.escape;

import java.util.Scanner;

public class EscapeBreak {

	/*주의사항
	 * switch문 내부에 작성하는 break;문과는 구분해야 함. (switch문을 빠져 나가는 용도로 사용.)
	 * break: break문을 만나는 순간 가장 가까운 반복문을 빠져 나감. = break;문이 속해 있는 반복문 '한 겹'을 빠져 나감.
	 */
	
	public void method1() {
		//목표: 무한 반복을 돌리면서 매번 사용자에게 문자열을 입력 받은 후, 해당 문자열의 길이를 출력.
		//단, 사용자가 입력한 문자열 "exit"과 같다면 반복을 종료함.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("글자수 체크 프로그램입니다.");
		System.out.println("(exit을 입력하면 종료됩니다.)");
		
		while(true) {
			System.out.print("글자를 입력해주세요 > ");
			String keyword = sc.nextLine();
			
			if(keyword.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(keyword+"은(는) "+keyword.length()+"글자입니다.");
		}
		
		//break는 반복문을 빠져 나간다.
		//return은 메소드를 빠져 나간다.
		//continue: 반복문 안에서 사용하는 문법. 반복문 안에서 continue를 만나면 이후에 모든 코드를 pass. 반복문 최상단 scope로 이동.
		
	}
	
	
	public void checkId() {
		Scanner sc = new Scanner(System.in);
		
			/*
			System.out.println("회원가입 서비스입니다.");
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("아이디를 입력해주세요(10글자 이하) > ");
				String userId = sc.nextLine();
				
				if(userId.length()<=10) {
					System.out.println(userId+"은(는) 사용 가능한 아이디입니다.");
					break;
				}
				System.out.println(userId + "은(는)"+"사용할 수 없는 아이디입니다.");
				}
			*/
		
		/*
		System.out.println("회원가입 서비스입니다.");
	    String message = "아이디를 입력해주세요(10글자 이하) > ";
		
		while(true) {
			System.out.print(message);
			String userId = sc.nextLine();
			
			if(userId.length()<=10) {
				System.out.println(userId+"은(는) 사용 가능한 아이디입니다.");
				break;
			}
			// 10글자가 넘었다면 다음 루프에서 보일 메시지를 변경
	        System.out.println(userId + "은(는) 사용할 수 없는 아이디입니다.");
	        message = "아이디를 다시 입력해주세요(10글자 이하) > ";
			}
			*/
		
		System.out.println("회원가입 서비스입니다.");
		boolean isFirst = true; // 첫 번째 시도인지 확인하는 변수
	    
	    while(true) {
	        if(isFirst) {
	            System.out.print("아이디를 입력해주세요(10글자 이하) > ");
	        } else {
	            System.out.print("아이디를 다시 입력해주세요(10글자 이하) > ");
	        }
	        
	        String userId = sc.nextLine();
	        
	        if(userId.length() <= 10) {
	            System.out.println(userId + "은(는) 사용 가능한 아이디입니다.");
	            break;
	        }
	        
	        System.out.println(userId + "은(는) 사용할 수 없는 아이디입니다.");
	        isFirst = false; // 한 번 실패했으므로 false로 변경
	    }
	}
		
	
			
}
