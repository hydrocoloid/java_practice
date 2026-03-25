package com.kh.vips.run;

import com.kh.vips.model.vo.Chef;
import com.kh.vips.model.vo.Duli;
import com.kh.vips.model.vo.Go;
import com.kh.vips.model.vo.Hong;
import com.kh.vips.model.vo.Lee;
import com.kh.vips.model.vo.MainChef;
import com.kh.vips.model.vo.MainPartChef;
import com.kh.vips.model.vo.SaladChef;

public class Run {

	public static void main(String[] args) {
		
		//단계1: 하나씩 만들기
		Lee lee = new Lee("이승철");
		Hong hong = new Hong("홍길동");
		Go go = new Go("고길동");
		Duli duli = new Duli("둘리");
		
		lee.cooking();
		hong.cooking();
		go.cooking();
		duli.cooking();
		
		lee.breaktime();
		hong.breaktime();
		go.breaktime();
		duli.breaktime();
		
		System.out.println("~~~~~~~~~~~~~");
		/*단계2: 배열 이용하기
		MainChef mcHong = new MainChef("홍길동");
		MainChef mcDuli = new MainChef("둘리");
		SaladChef scLee = new SaladChef("이승철");
		SaladChef scGo = new SaladChef("고길동");
		*/
		
		MainChef[] mains = {new MainChef("홍길동"), new MainChef("둘리")};
		SaladChef[] salads = {new SaladChef("이승철"), new SaladChef("고길동")};
		
		for(int i = 0; i < mains.length; i++) {
			mains[i].beefcooking();
			mains[i].breaktime();
		}
		for(int i = 0; i < salads.length; i++) { //length는 '배열의 총 길이(칸수)'를 알려주는 녀석이에요!
			salads[i].saladcooking();
			salads[i].breaktime();
		}
		
		//단계3: 다형성 적용하기
		System.out.println("~~~~~~~~~~~~~");
		Chef[] chefs = {new MainPartChef("홍길동")};
		
		for(int i = 0; i < chefs.length; i++) { //length는 '배열의 총 길이(칸수)'를 알려주는 녀석이에요!
			chefs[i].cooking();
			chefs[i].breaktime();
		}
		
		/* 정보 은닉(information hiding)
		 * (캡슐화도 정보 은닉의 한 방법).
		 * 어떻게 해야 객체끼리 서로 모르게 할 수 있을까.
		 * 외부로 노출 안 하고 클래스 내부에서 돌수록 좋다.
		 * 안 그럴 경우 하나 수정하면 다 수정해야 하니까.
		  
		 * 타입 숨기기? 
		 * MainPartChef("홍길동")이든 SaladPartChef("고길동")이든
		 * Chef[] 타입으로 여겨짐. 
		 */
		

	}

}
