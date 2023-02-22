package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		//Computer apple = new AppleComputer(); 로 사용해도됨 작은것은 큰것에 넣어쓸수 있기 때문(형변환)
		BananaComputer banana = new BananaComputer();
		apple.코딩하다();
		apple.유튜브하다();
		apple.인터넷하다();
		banana.코딩하다();
		banana.유튜브하다();
		banana.인터넷하다();
	}

}
