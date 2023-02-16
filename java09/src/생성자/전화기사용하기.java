package 생성자;
//7주차에 있는거 수정하기

public class 전화기사용하기 {

	public static void main(String[] args) {
		// 전화기를 만들어보자. 2개를 만들어보자.
		전화기 p1 = new 전화기(); //전화기 위에 F2번눌러서 임포트 누르거나 전화기를 치고 컨트롤 엔터 해서 눌러주기
		p1.price = 1000;
		p1.shape = "폴더";
		p1.인터넷하다();
		System.out.println("p1의 가격 : " + p1.price);
		System.out.println("p1의 모양 : " + p1.shape);
		
		전화기 p2 = new 전화기();
		p2.price = 2000;
		p2.shape = "네모";
		p2.카톡하다();
		System.out.println("p2의 가격 : " + p2.price);
		System.out.println("p2의 모양 : " + p2.shape);
		
		
	}

}
