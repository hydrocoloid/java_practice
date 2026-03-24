package com.kh.chap03.view;

import java.util.Scanner;
import com.kh.chap03.model.vo.Receipt;

public class ReceiptView {
	//view = 입출력 화면 담당. 앱의 웰컴페이지 역할.
	
	public void mainMenu() {
		//사용자에게 영수증 정보를 입력 받고
		//입력 받은 영수증 정보를 출력해주자.
		
		Scanner sc = new Scanner(System.in);
		
		Receipt r = new Receipt();
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
		System.out.print("상품명은 무엇인가요? > ");
		String storeName = sc.nextLine(); 
		r.setStoreName(storeName); 
		
		System.out.print("가격은 얼마인가요? > ");
		int price = sc.nextInt(); // sc.nextInt(); 다음엔 sc.nextLine(); 해줘야 개행문자 사라짐.
		sc.nextLine();
		r.setPrice(price); //메소드 호출부에서 메소드를 호출하면서 넘길 수 있는 것은 오로지 값뿐.
		
		System.out.print("결제수단은 무엇인가요? > ");
		String payment = sc.nextLine(); //sc에는 scanner 객체의 주소값이 대입되어 있다!
		r.setPayment(payment); 
		
		System.out.print("결제일시는 언제인가요? > ");
		String date = sc.nextLine(); 
		r.setDate(date); 
				
		System.out.println("====================");
		String info = r.info(); 
		System.out.println(info);
		
		sc.close();
	}
	
}
