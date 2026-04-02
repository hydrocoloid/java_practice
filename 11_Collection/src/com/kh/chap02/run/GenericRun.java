package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

//import com.kh.chap02.model.Box;
import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		
		/*
		ArrayList list1 = new ArrayList(); 
		List list2 = new ArrayList(); // ArrayList는 List의 후손. List 자료형에 대입하면 다양한 List를 넣을 수 있다.
		
		List list = new ArrayList(); 
		list.add("gasg");
		list.add(121);
		list.add(true);
		
		String text = (String)list.get(0); //단점: 꺼낼 때 불편하다! -> 여차하면 에러 남.
		String text2 = (String)list.get(1);
		
		// 그래서 제너릭을 쓴다.
		List<String> list3 = new ArrayList();
		list3.add("gasg");
		//list3.add(121); -> 컴파일러가 "얘 스트링 아닌데?"하고 걸러줌.
		//list3.add(true);
		*/
		
		/*
		StringBox sb = new StringBox();
		sb.set("good day");
		System.out.println(sb.get());
		
		IntegerBox ib = new IntegerBox();
		ib.set(123);
		System.out.println(ib.get());
		*/
		
		/*
		Box<String> sb = new Box();
		sb.set("gkgk");
		System.out.println(sb.get());
		Box<Integer> ib = new Box();
		System.out.println(ib.get());
		Box<Plant> pb = new Box();
		pb.set(new Plant("금전수", "동양화"));
		System.out.println(pb.get());
		*/
		
		List<Plant> plants = new ArrayList<Plant>();
		plants.add(new Plant("관엽", "폴리샤스"));
		plants.add(new Plant("관엽", "산세베리아"));
		
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		// 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음.
		// 매번 형변환하는 절차를 없앨 수 있음 => 코드 작성할 때 편함.
		
	}

}
