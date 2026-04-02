package com.kh.chap01.run;

import com.kh.chap01.Integers;

public class Run {

	public static void main(String[] args) {
		// 정수를 여러 개 다루고 싶음. 몇 개를 쓸 지는 모르겠음.
		
		Integers i = new Integers();
		i.add(1000);
		i.add(1001);
		i.add(1002);
		i.add(1003);
		
		System.out.println(i.get(0));
		System.out.println(i.get(1));
		System.out.println(i.get(2));
		System.out.println(i.get(3));

	}

}
