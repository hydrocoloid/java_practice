package com.kh.chap03.run;

import com.kh.chap03.model.vo.KakaoWebtoon;
import com.kh.chap03.model.vo.NateWebtoon;
import com.kh.chap03.model.vo.NaverWebtoon;
import com.kh.chap03.model.vo.Webtoon;

public class Run {

	public static void main(String[] args) {
		
		Webtoon webtoon = new Webtoon("화산귀환", "LICO", "수요일");
		NaverWebtoon nw = new NaverWebtoon("전지적 독자 시점", "UMI", "월요일", "현금");
		KakaoWebtoon kw = new KakaoWebtoon("수린당 성군전", "일링스", "화요일", true);
		
		System.out.println(webtoon.info());
		System.out.println(nw.info());
		System.out.println(kw.info());
		
		System.out.println(webtoon); // = System.out.println(webtoon.toString()); 
		/* toString()이 눈에 보이지 않지만 자동으로 붙음. -> 부모클래스(object)의 메소드를 호출한 것.
		 toString(): 해당 객체의 FullClassName + @ + 해당 객체의 주소값을 16진수 형태로 변환.
		 중요!: 모든 클래스는 Object클래스를 상속 받고 있기 때문에 모든 객체는 toStirng() 메소드를 호출할 수 있음. 
		 */
		 
		NateWebtoon nwt = new NateWebtoon("재미있는 웹툰", "작가");
		System.out.println(nwt);

	}

}
