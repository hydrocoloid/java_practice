package com.kh.chap01.run;

import java.io.File;
import java.io.IOException;

public class FileRun { // File 클래스(jave.io 패키지에 존재)

	public static void main(String[] args) {
		
		File file1 = new File("abc.txt"); //The constructor File() is undefined -> File() 생성자가 정의되지 않았습니다.
		
		//파일 만들기
		try {
		file1.createNewFile(); //Unhandled exception type IOException -> 처리되지 않은 예외 유형 IOException
		
		//폴더 만들기(directory)
		File folder = new File("folder");
		folder.mkdir(); //make directory
		
		// 경로지정
		File file2 = new File("folder/test.txt");
		file2.createNewFile();
		
		//파일클래스에서 제공하는 여러가지 메소드들
		System.out.println("파일인가요?:" + file2.isFile());
		System.out.println("파일명은 뭔가요?: " + file2.getName());
		System.out.println("파일의 절대 경로는?: " + file2.getAbsolutePath());
		System.out.println("파일의 크기는 얼만가요?: " + file2.length() + "KB");
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
