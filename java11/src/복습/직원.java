package 복습;

public class 직원 {
	public String name; // 같은 + 다른 패키지 (아무데서나 접근 가능)
	String address; // 같은 패키지 접근 가능
	protected int salsry; // 같은 패키지 + 상속한 다른 패키지 접근가능
	private String rrn; // 이 클래스 안에서만 접근가능
	
	
	public String getRrn() { //getr + 컨트롤 + 스페이스바
		return rrn;
	}
}
