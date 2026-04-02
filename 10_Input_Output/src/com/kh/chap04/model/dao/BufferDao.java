package com.kh.chap04.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	// 기반스트림이 input, output 계열일 경우(byte스트림) -> 보조스트림도 input, output 계열 사용.
	// 기반스트림이 reader, writer 계열일 경우(문자스트림) -> 보조스트림도 reader, writer 계열 사용.
	
	// 이번엔 BufferedReader / BufferedWriter를 사용할 것이다. 
	// -> (이론적으론) 속도 향상이 목적인 보조스트림. 임시공간을 제공해서 한 번에 입출력을 진행.
	
	//속도향상이 목적인 보조스트림 -> 임시공간을 제공해서 한 번에 입출력을 진행.
	
	public void outputFile() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
		fw = new FileWriter("d_buffer.txt");
		bw = new BufferedWriter(fw); // 인자값을 채워줘야 함!
		
		bw.write("하이요");
		bw.newLine();
		bw.write("이이에");
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//자원 반납은 항상 생성의 역순으로 진행!
			try {
			bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				fw.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public void inputFile() {
		try(BufferedReader brf = new BufferedReader(new FileReader("d_buffer.txt"))){
			String str = "";
			while((str = brf.readLine()) != null){
				System.out.println(str);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
