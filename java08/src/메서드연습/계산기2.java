package 메서드연습;

public class 계산기2 {
	//자바는 메서드 이름을 입력값이 다르면 , 다 동일하게 써도된다.
	//하나의 이름으로 다양한 형태를 구현 가능하다.
	//===> 다형성(오버로딩) ----> 용어 기억하기!! 오버로딩~~!!
	public int add(int x, int y) { //자바는 입력타입이 다르기 때문에 이름을 똑같이 add로 해도 됨!
		return x + y;
	}
	public double add(int x, double y) { //자바는 입력타입이 다르기 때문에 이름을 똑같이 add로 해도 됨!
		return x + y;
	}
	public double add(double x, double y) { //자바는 입력타입이 다르기 때문에 이름을 똑같이 add로 해도 됨!
		return x + y;
	}
	public String add(String x, int y) { //자바는 입력타입이 다르기 때문에 이름을 똑같이 add로 해도 됨!
		return x + y + "시에 점심을 먹겠어!";
	}
}
