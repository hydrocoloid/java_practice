package com.kh.sw.controller; //service 역할까지 한다.

import com.kh.sw.model.vo.Switch;
import com.kh.sw.util.SwitchUtil;
import com.kh.sw.util.SwitchUtilImpl;

public class SwitchController {
	private Switch s = new Switch(false);
	
	
	public boolean toggleSwitch() {
		SwitchUtil su = new SwitchUtilImpl();
		boolean on = su.toggle(s);
		//System.out.println(on);
		
		return on;
	}
	

}
