package com.kh.chap05.view;

import com.kh.chap05.model.vo.Member;

public class MemberView {

	public void memberMenu() {
		
		Member member = new Member();
		//new Member();에서 Member()는 기본생성자.
		//객체를 생성할 목적으로(메모리값 초기화) 호출해서 사용.
		
		System.out.println(member.info());
		//new Member("user01");
		
		Member member1 = new Member("user01");
		System.out.println(member1.info());
		
		Member member2 = new Member("user02", "1234");
		System.out.println(member2.info());
		
		Member member3 = new Member("user03", "1234", "홍길동");
		System.out.println(member3.info());
	}
	
}
