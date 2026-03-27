package com.kh.sw.util;

import com.kh.sw.model.vo.Switch;

public class SwitchUtilImpl implements SwitchUtil {

	@Override
	public boolean toggle(Switch s) {
		boom();
		s.setOn(!s.isOn());
		// 현재 on의 필드값 -> 돌려 주기 전에 반전해줘야 함.
		return s.isOn();
	}
	
	/**
	 *  이 메소드는 SwitchBoomException을 상속 받아 구현하고 있으며,
	 * 스위치를 눌렀을 때 10% 확률로 폭발이 일어나기 때문에 예외를 발생시키려고 구현하였음.
	 * @author user1
	 * @since 2026-03-27
	 */
	private void boom() { 
		// 10% 확률로 아무 문제 업음. 90% 확률로 대폭발.
		
		int rand = (int)(Math.random()*100+1);
		
		if(rand <= 90) {
			throw new RuntimeException("스위치 대폭발"); //throw: 개발자가 직접 예외를 발생시키는 구문.
		} 
	}
	

}
