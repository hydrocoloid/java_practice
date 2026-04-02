package com.kh.chap04.run;

import com.kh.chap04.model.dao.ObjectDao;

public class Run {

	public static void main(String[] args) {
		//보조스트림을 써 보자!
		
		/*
		BufferDao bd = new BufferDao();
		bd.outputFile(); 
		bd.inputFile();
		*/
		
		ObjectDao od = new ObjectDao();
		od.outputFile();
		od.inputFile();
	}

}
