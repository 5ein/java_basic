package 네트워크프로그램;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception { //throws Exception 는 try-catch와 같은역할
		// 1. 승인용 소켓을 만들어주자.
		// 2. 서버는 계속 살아있게 하기 위해 무한루프!
		// 3. 요청이 있으면 승인을 해주고
		// 4. 통신할 수 있는 소켓을 만들어주자.!
		
		//네트워크와 관련괸것은 패키지가 java.net에 있음
		ServerSocket server = new ServerSocket(9100); //가로안에 port 숫자 4개 넣기
		//한번 실행했는데 그것을 안끄고 또 실행시키면 똑같은 포트로(주소) 두개 돌릴수 없어 오류가 뜬다! 
		//위 상황에 XX버튼눌러주면 이전에 이미 실행되고 있는 애가 나옴.
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는 중");
		
		int count = 0; //클라이언트 요청 수 세려고 만듬
		
		while (true) { // 무한루프
			Socket socket = server.accept(); //Socket
			count++; //클라이언트가 요펑하고 승인한 만큼 count됨!
			System.out.println(count + ">> 승인완료! Soket생성됨.!");
		}
		
	}
}
