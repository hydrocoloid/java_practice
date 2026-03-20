package com.kh.chap03.run;

import com.kh.chap03.view.ReceiptView;

public class Run {

	public static void main(String[] args) {
		
		new ReceiptView().mainMenu();
		/*[일회성 호출]
특징: 객체를 만들자마자 바로 메소드를 호출하고 끝냅니다.
메모리 상태: new를 통해 힙(Heap) 메모리에 객체가 생성되지만, 
이 객체의 주소값을 저장해둔 변수가 없습니다.
장점: 코드가 한 줄로 짧고 간결합니다.
단점: 호출이 끝나면 이 객체에 다시 접근할 방법이 없습니다. 
자바의 가비지 컬렉터(GC)가 "어, 이거 이름표(변수)도 없네?" 하고 
곧 수거해버릴 1회용 객체가 됩니다.
		 */
		/*
		ReceiptView rv = new ReceiptView();
		rv.mainMenu();
		[참조 변수 활용]
특징: 객체를 생성한 뒤 rv라는 변수에 그 주소값을 저장해둡니다.
메모리 상태: rv라는 이름표가 힙 메모리에 있는 객체를 꽉 붙잡고 있습니다.
장점: mainMenu()를 실행한 후에도 
rv.다른메소드()를 호출하거나 다시 사용할 수 있습니다. 
프로그램이 끝날 때까지 혹은 변수가 사라질 때까지 
객체가 메모리에 안전하게 유지됩니다.
단점: 코드가 두 줄이 됩니다.
		*/

	}

}
