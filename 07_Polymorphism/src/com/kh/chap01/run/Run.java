package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		
		/* 다형성(Polymorphism): 부모타입 자료형으로 (여러) 자식타입 자료형을 다룰 수 있다.
		 * 상속이 시작이다. 다형성의 전제 조건은 상속 구조일 것.
		 * 클래스 = 자료형(타입).
		 * 상속은 자료형을 물려주는 것 (매우 중요!!!)
		 */
		
		/* 업캐스팅 & 다운캐스팅
		 * UpCasting: 자식타입을 부모타입에 대입. 생략 가능.
		 * DownCasting: 부모타입 => 자식타입. 생략이 불가능. 꼭 명시해줘야 함.
		 */
		
		Parent p1 = new Parent();
		//p1.printParent();
		
		/* p1.printChild();
		 * 부모클래스는 자식클래스가 누군지도 모른다. 자식의 멤버는 부모가 사용할 수 없음.
		 * p1변수로는 Parent 타입의 객체만 사용 가능.
		 */
		
		Child1 c1 = new Child1();
		c1.printChild1();
		//c1.printParent();
		//c1변수로는 Child1, Parent타입 객체 사용 가능.
		
		Parent p2 = new Child1(); // => Parent p2 = (Parent)new Child1();
		/* 양쪽의 자료형이 다름에도 불구하고 대입 될 수 있는 이유는
		 * 부모클래스인 Parent가 자식클래스인 Child1에게 자료형을 상속해주었기 때문에
		 * child1 객체가 Parent 타입으로 형변환되어 대입됨.
		 */
		
		//p2.printParent();
		/*Parent 자료형 변수에 Child1 자료형을 대입?!?
		Parent p2 = new Test();는 안 된다. 왜? 상속 구조가 아니어서.
		child1 객체가 Parent 자료형을 가지고 있어야 한다. -> 상속 통해 받음.
		*/
		// p2.printChild1(); -> p2로는 Parent 타입 객체만 사용 가능.
		// => 부모타입 자료형으로 자식 객체를 다룰 수 있음.
		
		
		//child1타입 객체 2, child2타입 객체 2 다루고 싶다? -> 객체 생성 먼저.
		
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		
		/*50개씩 다루고 싶다면? -> 배열을 써보자 
		 * -> 배열: 같은 자료형의 여러 주소값을 관리할 수 있음.
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[1] = new Child2();
		
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		*/
		
		//다형성을 써 보자!!
		Parent[] arr = new Parent[4];
		arr[0] = new Child1();
		arr[1] = new Child2();
		arr[2] = new Child1();
		arr[3] = new Child2();
		
		for(int i = 0; i < arr.length; i++) {
			/* 다형성을 이용해서 간단하게 만들 수 있다.
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			} else {
		        ((Child2)arr[i]).printChild2();
			}
			*/
			arr[i].print();
		}
		
		
	}

}
