package 네트워크프로그램;

import java.net.Socket;

public class TCPClients {
	//socket은 client 마다 따로 만들어 진다.
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) { // 다른 서버에 이거 돌리면 서버 죽어서 경찰에게 연락온대 (디도스 공격!)주의하자
			// 서버랑 클라이언트랑
			// 양쪽에 전화기 역할을 하는 소켓이 있어야함.
			// 클라이언트에서 소켓을 만들어주면, 서버소켓으로 승인요청을 보냄.
			Socket socket = new Socket("localhost", 9100); // TCPSercer의 socket port번호와 같다.
			// localhost부분에 다른 사이트 ip 넣으면.. 큰일날수도!
			System.out.println("클라이언트 승인 요청 보냄.!"); // 서버가 살아있을때만 사용가능 ==>서버 살리고 이거 실행!
			// 오른쪽 아래 오른쪽에서 네번째꺼 누르면 다른곳에서도 보임!
		}
	}

}
