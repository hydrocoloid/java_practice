package com.kh.chap03.view;

import java.util.Scanner;
import com.kh.chap03.model.vo.Receipt;

public class ReceiptView {
	//view = 입출력 화면 담당. 앱의 웰컴페이지 역할.
	
	public void mainMenu() {
		System.out.println("뷰 클래스입니다.");
		
		//사용자에게 영수증 정보를 입력 받고
		//입력 받은 영수증 정보를 출력해주자.
		
		Scanner sc = new Scanner(System.in);
		
		Receipt R = new Receipt();
		/*heap영역에 생성된 Receipt() 개체는
		//사용자에게 영수증 정보를 입력 받고
		//입력 받은 영수증 정보를 출력해주자.
		 *동안 유지되면 된다.
		 
		 *Receipt라는 클래스를 가지고 객체 생성.
		 *new Receipt(); = 객체 <- 추상적인 개념.
		 *= instance: 실제 메모리에 올라 간 데이터.
		 
		 * Receipt R = 참조자료형. 객체지향에선 이게 가장 중요.
		 * 클래스를 만든다는 행위 = 개발자가 자신에게 필요한 나만의 자료형을 만들겠다.
		 * 클래스 = 타입.
		 * 여러 자료형에 여러 개의 값을 보관할 수 있다. (배열은 같은 자료형만 묶어서 보관 가능.)
		 * 그리고 수행할 수 있는 기능도 같이 보관할 수 잇다.
		 */
		
		
		
		
		
		sc.close();
	}
	
}
