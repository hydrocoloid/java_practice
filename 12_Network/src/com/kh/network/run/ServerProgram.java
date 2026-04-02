package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	
	public static void main(String[] args) {
		
		/* 통신을 하기 위해서는 서버와 클라이언트 연결이 필요함.
		 * 두 개의 클래스를 사용하자: ServerSocket, Socket
		  
		 * ServerSocket: 클라이언트에게 열어 줄 포트번호를 준비해야 한다. 포트번호와 연결(Bind)해서 외부의 연결 요청을 기다리다가 요청이 들어 오면 수락해 줄 용도.
		 * 수락하는 순간에 서버에 Socket객체 생성.
		  
		 * Socket: Process 간의 통신을 담당. (소켓은 무전기다.)  
		 * Stream이 두 개 필요. (스트림은 단방향이기 때문.) 
		 * Socket객체를 이용해서 통신을 위한 기반스트림 InputStream / OutStream을 제공 받음. -> 기반스트림은 1Byte라 한글 깨짐. -> 보조 스트림 사용.
		  
		 * 소켓 통신용 서버 측 프로그램 작성 절차
		 * 1) 포트 번호 지정: 0~1024 제외. 1025부터 자유롭게 쓰면 된다.
		 * 2) ServerSocket객체 생성 -> 매개변수 생성자 호출 시 포트 번호를 인자로 전달. = 포트 결합(Binding).
		 * 3) 서버는 클라이언트 요청이 올 때까지 대기 상태 유지.
		 * 4) 클라이언트가 연결 요청 하면 서버는 자동 수락 후에 통신이 가능한 Socket객체를 반환함.
		 * 5) Socket객체를 이용해서 입출력 스트림 열어주기.
		 * 6) 보조스트림을 추가해서 성능을 개선.
		 * 7) 데이터를 주고 받는 코드를 작성. -> 웹 개발자가 하는 일은 이게 전부다!
		 * 8) 자원 반납. 
		 */
		
		 //서버측 프로그램 구현해보자. (finally로 자원 반납.)
		 // 0) 필요한 변수 선언!
		
		Scanner sc = new Scanner(System.in);
		
		// 자원 반납을 위해 미리 참조변수 선언하고 null값으로 초기화.
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
			// 1) 포트 번호 지정: 0~1024 제외. 1025부터 자유롭게 쓰면 된다.
		int portNumber = 1234;
		
			// 2) ServerSocket객체 생성 -> 매개변수 생성자 호출 시 포트 번호를 인자로 전달. = 포트 결합(Binding).
		try {
			server = new ServerSocket(portNumber);
			
			// 3) 서버는 클라이언트 요청이 올 때까지 대기 상태 유지. -> 우리가 뭘 할 필요는 없다.
			System.out.println("클라이언트의 요청을 기다리는 중...");	
		
			// 4) 클라이언트가 연결 요청 하면 서버는 자동 수락 후에 통신이 가능한 Socket객체를 반환함.	
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결 성공!");
		
			// 5) Socket객체를 이용해서 입출력 스트림 열어주기 + 6) 보조스트림을 추가해서 성능을 개선.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream()); //출력용 스트림
			/* socket객체가 제공하는 입력용 기반스트림 => InputStream => 1Byte
			   바이트스트림과 문자스트림을 호환해주는 보조스트림 => InputStreamReader
			   속도 향상, 한글 전달을 위한 입력용 보조스트림 => BufferedReader => 2Byte
			   PrintWriter는 2바이트짜리 문자용이지만 1바이트짜리도 호환 가능.
			 */
			
			// 7) 데이터를 주고 받는 코드를 작성.
			while(true) {
				String message = br.readLine(); //7-1)클라이언트에게 입력 받기
				if(message.equals("null")) {
					break;
				}
				System.out.println("클라이언트로부터 받은 메시지: "+message);
				
				System.out.print("클라이언트에게 전송할 메시지: "); //7-2)출력 받기
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				pw.flush(); //7-3)스트림에 있는 데이터를 강제로 내보내기
				
			}
			
			// 8) 자원 반납. 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
