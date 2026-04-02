package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		
		/* 클라이언트 프로그램 작성 절차
		 * 1) 요청하고자 하는 서버의 IP주소와 Port번호를 지정.
		 * 2) 서버에 연결 요청 보내기. => Socket객체 생성(IP주소, Port번호).
		 * 3) 소켓에서 서버와 통신할 수 있는 입출력 스트림을 get하기.
		 * 4) 보조스트림 달기(한글 전송).
		 * 5) 스트림을 통해 데이터 주고 받기.
		 * 6) 자원 반납.
		 */
		
		// 0)필요한 변수 선언 + 자원 반납을 위해 참조변수 선언 및 null로 초기화.
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) 요청하고자 하는 서버의 IP주소와 Port번호를 지정.
		// 내 pc의 IP주소(범용): 127.0.0.1 = Loopback IP. (Localhost로 대체 가능.)
		// Port번호: 1234 (아까 우리가 정한 번호)
		String serverIp = "127.0.0.1";
		int portNumber = 1234;
		
		// 2) 서버에 연결 요청 보내기. => Socket객체 생성(IP주소, Port번호).
		
		try {
		socket = new Socket(serverIp, portNumber);
		if(socket != null) {
			System.out.println("서버와의 연결에 성공했습니다~");
		}
		
		// 3) 소켓에서 서버와 통신할 수 있는 입출력 스트림을 get하기.
		// 4) 보조스트림 달기(한글 전송).
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream());
		
		// 5) 스트림을 통해 데이터 주고 받기.
		while(true) {
			//서버로 출력하기
			System.out.println("종료를 원하시면 exit을 입력해주세요.");
			System.out.print("보낼 메시지 > ");
			String sendMessage = sc.nextLine();
			if(sendMessage.equals("exit")) {
				break;
			}
			pw.println(sendMessage);
			pw.flush();
		}
		
			//서버로 입력 받기
		String message = br.readLine();
		System.out.println("메시지 도착 > "+message);
		
		}catch(IOException e){
			e.printStackTrace();
		} finally {
			
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
		}
		
	}

}
