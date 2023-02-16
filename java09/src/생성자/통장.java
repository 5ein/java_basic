package 생성자;

public class 통장 {
	String name; //이름
	String ssn; //주민번호
	int money; //돈
	
	//이름, 주민번호, 돈을 입력해야 통장을 만들 수 있게 할 것이다.
	//source->Generate Constructors using Fields -->generate 누르기
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
	//얘를 넣으면 주소 대신 저런 형식으로 나올수 있게 해줌!! (toString 재정의 하는것!)
	//source->Generate toString() -> generate 누르기
	@Override //얘가 재정의 라는 뜻!
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	// 이름, 주민번호 만으로도 만들수 있게 하고싶을때!
//	public 통장(String name, String ssn) {
//		this.name = name;
//		this.ssn = ssn;
//	}
	
	
	
}
