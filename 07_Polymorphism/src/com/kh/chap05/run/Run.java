package com.kh.chap05.run;

import com.kh.chap05.model.service.ExpensiveFilter;
import com.kh.chap05.model.service.SoupFilter;
import com.kh.chap05.model.vo.Soup;

public class Run {

	public static void main(String[] args) {
		
		Soup[] soups = {
			new Soup("김치찌개", "돼지고기", 5000),
			new Soup("순두부김치찌개", "순두부", 7000),
			new Soup("쭈꾸미김치찌개", "쭈꾸미", 12000),
			new Soup("참치김치찌개", "참치", 9000),
			new Soup("꽁치김치찌개", "꽁치", 10000),
			new Soup("종합김치찌개", "돼지고기, 순두부, 쭈꾸미, 참치 등", 15000),
		};
		
		/*
		//재료에 참치가 들어가는 김치찌개를 골라줘.
		
		SoupFilter filter = new TunaFilter();
		
		for(int i = 0; i < soups.length; i++) {
			if(filter.test(soups[i])) {
				System.out.println(soups[i].getName());
			}
		}
		
		//위와 동일한 for문.
		for(Soup s : soups) {
			if(filter.test(s)) {
				System.out.println(s.getName());
			}
		}
		*/
		
		
		//만 원 이상 김치찌개만 골라줘.
		SoupFilter ef = new ExpensiveFilter();
		for(Soup s : soups) {
			if(ef.test(s)) {
				System.out.println("10000원 이상 찌개: "+s.getName());
			}
		}
		
		
		//김치찌개 이름이 네 글자 이하인 김치찌개만 찾는 거 만들어 주세요~
		//9000원 이하 김치찌개 찾는 거 만들어 주세요~
		
		/* 익명클래스: 클래스를 따로 구현하지 않고 쓰는 자리에서 바로 구현하는 방법.
		 * 말 그대로 '이름이 없는' 클래스. 클래스 안 만들고 오버라이딩.
		 */
		
		SoupFilter cheapFilter = new SoupFilter() {
			@Override
			public boolean test(Soup s) {
				return s.getPrice() <= 9000;
				//구현클래스 바디를 메소드 블록 안에 서술.
			}
		};
		
		for(Soup s : soups) {
			if(cheapFilter.test(s)) {
				System.out.println("9000원 이하 찌개: "+s.getName());
			}
		}
		
		SoupFilter shortNameSoupFilter = new SoupFilter() {
			@Override
			public boolean test(Soup s) {
				return s.getName().length() <= 4;
			}
		};
		for(Soup s : soups) {
			if(shortNameSoupFilter.test(s)) {
				System.out.println("이름 짧은 김치찌개: "+s.getName());
			}
		}
		
		// 1단계: 익명클래스 작성.
		SoupFilter Filter1 = new SoupFilter() {
			@Override
			public boolean test(Soup s) {
				return s.getMainMenu().contains("치");
			}
		};
		
		//2단계: 람다(단축화 버젼)
		//인터페이스명, 애노테이션, 접근제한자, 반환형, 메소드명 싹 날리고 (매개변수) -> {실행문}
		SoupFilter Filter2 = (Soup s) -> {
			return s.getMainMenu().contains("치");
		};
		
		//3단계: 타입추론 - 매개변수의 자료형 날림. 매개변수가 하나면 괄호도 제거 가능.
		SoupFilter Filter3 = s -> {
			return s.getMainMenu().contains("치");
		};
		
		//4단계: 중괄호 안 실행문이 한 줄이라면 중괄호 + return문 생략.
		SoupFilter Filter4 = s -> s.getMainMenu().contains("치");
				
		
		for(Soup s : soups) {
			if(Filter4.test(s)) {
				System.out.println("재료에 치 들어가는 김치찌개: "+s.getName());
			}
		}

	}

}
