package com.kh.chap02.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

//VO(Value Object)
//DAO(Data Access Object): 데이터가 보관되어 있는 공간에 '직접 접근'해서 입/출력 하는 메소드들을 구현함.

public class FileByteDao {
	
	//목표: 파일에 프로그램에서 만들어진 데이터를 출력(ByteStream 사용)
	
	public void outputToFile() {
		/*출력: 프로그램 내의 데이터를 밖으로 내보내겠다. 프로그램 -> 외부(파일)
		 *통로의 이름은 OutputStream -> FileOutputStream (파일로 내보낼 거니까.)
		 * FileOutputStream: "파일"로 데이터를 출력할 때, 파일과 연결하는 1Byte 단위의 스트림. 
		 */
		
		//1. FileOutputStream객체 생성.
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt");
		//생성자 호출 시 파일명을 전달. 존재하지 않는 파일명일 경우 해당 파일을 생성하면서 스트림 생성함.
		fos.write(97); //2.스트림을 통해 데이터를 출력: Write() 호출.
		fos.write(98);
		fos.write(99);
		
		byte[] arr = {101,102,103};
		fos.write(arr);
		fos.write('A');
		//fos.write('캭'); FileOutputStream 형식의 write(int) 메서드는 다음 인수(문자열)에는 적용할 수 없습니다.
		//한글은 2Byte라 write로 안 됨. 문자스트림을 써야 함.
		
		
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} 	
			
		try {
			if(fos != null) {
				//3. 스트림의 사용이 끝남. -> '반드시' 자원 반납해줘야 함. = .close()
				fos.close(); //Unhandled exception type IOException
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}	
		
		
	public void inputFromFile() {	
		/* 입력: 파일로부터 데이터를 가지고 오겠다.
		 * FileInputStream: 파일로부터 데이터를 가져 와서 입력 받을 건데, 1Byte 단위로 입력 받겠다.
		 */
		
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream("a_byte.txt"); //(1)입력 스트림 생성하기
		
		//(2)데이터를 입력 받기 -> read() 호출
		/*
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println(fis.read()); //파일의 마지막 데이터를 입력 받은 뒤 read 호출 시 -1을 반환 받음.
		*/
		
		/*
		while(true) {
			int value = fis.read();
			
			if(value != -1) {
				System.out.println((char)value);
			}else {
				break;
			}
		}
		*/
		
		int value = 0;
		while((value = fis.read()) != -1) {
			System.out.println((char)value);
		}
		
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}	
		
		
		
		

}
