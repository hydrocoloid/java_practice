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
		 */
		
		
		
		sc.close();
	}
	
}
