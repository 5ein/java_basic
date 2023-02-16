package 생성자;

//컴퓨터.java와 컴퓨터조립.java를 완성해보세요.!
//==> 파라메터있는 생성자가 필요!
//==> toString()있으면 편하게 멤버변수의 값을 출력해서 확인할 수 있음.

public class 컴퓨터 {
	int 가격;
	String 제조회사;
	int 모니터크기;
	
	//이름, 주민번호, 돈을 입력해야 통장을 만들 수 있게 할 것이다.
	//source->Generate Constructors using Fields -->generate 누르기
	public 컴퓨터(int 가격, String 제조회사, int 모니터크기) {
		super();
		this.가격 = 가격;
		this.제조회사 = 제조회사;
		this.모니터크기 = 모니터크기;
	}

	//얘를 넣으면 주소 대신 저런 형식으로 나올수 있게 해줌!! (toString 재정의 하는것!)
	//source->Generate toString() -> generate 누르기
	@Override
	public String toString() {
		return "컴퓨터 [가격=" + 가격 + ", 제조회사=" + 제조회사 + ", 모니터크기=" + 모니터크기 + "]";
	}
	
}
