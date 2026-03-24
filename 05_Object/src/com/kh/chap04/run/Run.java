package com.kh.chap04.run;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.view.FieldView;

public class Run {

	public static void main(String[] args) {
		
		FieldView fv = new FieldView();
		fv.check();
		// = new FieldView().check();
		
		System.out.println(FieldController.str);
		System.out.println(FieldController.JAVA_VERSION);

	}

}
