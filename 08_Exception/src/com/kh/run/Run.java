package com.kh.run;

import com.kh.controller.CheckedException;
import com.kh.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {
		
		UncheckedException ue = new UncheckedException();
		//ue.divZero();
		//ue.code();
		//ue.multiCatch();
		//ue.orderByCatch();
		
		CheckedException ce = new CheckedException();
		ce.readString();
		
	}

}
