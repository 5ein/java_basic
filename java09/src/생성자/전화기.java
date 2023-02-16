package 생성자;
//7주차에 있는거 수정하기

public class 전화기 {
	// 성질 : 멤버변수
	//public은 아무데서나(다른패키지에서도) 접근 가능 설정(접근제어자)
	public int price; // 멤버변수는 자동초기화를 시켜줘서 이미 0이 들어가있음 (기본형)
	public String shape; // 기본형이 아닌경우(참조형) null로 자동으로 초기화 되어있음

	//눈에 보이지는 않지만 기본 생성자가 만들어져 있음. == (묵시적)으로 기본 생성자가 만드렁져있음
	//==>객체 생성할 때 마다 이 메서드를 자동 호출하여 전화기 객체가 만들어졌음 프린트하고싶을때?
	//source 누르고 -> Generate Constructors from Superclass 누르고 -> generate 눌러주면 밑에꺼 뜸
	public 전화기() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// 동작 : 멤버메서드(함수와 동일), 동적인 기능을 수행
	// 인터넷하다, 카톡하다.
	public void 인터넷하다() { //public붙이면 다른 패키지에서도 사용할수 있음
		// 기능 처리하는 방법을 나열
		System.out.println("와이파이 연결하다.");
		System.out.println("데이터를 써서 연결하다.");
	}


	public void 카톡하다() { //public붙이면 다른 패키지에서도 사용할수 있음
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}

}
