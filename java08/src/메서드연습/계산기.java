package 메서드연습;

public class 계산기 {
	
	public void 더하기(int x, int y) { //더하기(2,3)
		System.out.println("더하기 기능 처리 방법 내용...");
		System.out.println(x + y); //리턴이 없기 때문에 void
	}	
	
	public void 곱하기(int x, int y, int z) {
		System.out.println("곱하기 기능 처리 방법 내용...");
		System.out.println(x * y * z);
	}
	
	public int 빼기(int x, int y) {//매개변수(parameter)
		System.out.println("뺴기 기능 처리 방법 내용");
		return x - y; //리턴값이 있고 이것이 int이기 때문에 void대신 int 써줘야함!
	}
	
}
