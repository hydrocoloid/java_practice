package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04.model.vo.Sandwich;

public class PropertiesRun {

	public static void main(String[] args) {
		
		/* 파일은 파일인데 확장자가 .properties인 애들이 있음.
		 * 변경하지 않는 설정 정보, 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 용도로 많이 사용.
		 * map을 상속 받음. -> 상속이 잘못된 예시로 가장 많이 듦!!
		 * 
		 */
		
		Properties prop = new Properties(); 
		prop.put("asldjfl", new Sandwich("맛있음", "에그마요"));
		
		try {
		prop.store(new FileOutputStream("test.properties"), "sldkjflsdf");
		} catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
