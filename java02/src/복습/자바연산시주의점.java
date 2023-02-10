package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// 자바 연산시 주의점
		int x = 20; //컨트롤+알트+화살표아래 :한줄복사
		int y = 30;
		
		//ram에서 값을 가지고와서 연산은 cpu가 함.
		System.out.println(x / y);
		//소숫점까지 구하고 싶은 경우에는 위처럼 하면 안됨!
		//정수와 정수의 계산의 결과는 무조건 정수!
		//계산시 하나라도 실수이면 결과는 무조건 실수!
		
		
		int x2 = 20;
		double y2 = 30; //double 에는 정수 실수 다 가능!
		System.out.println(x2 / y2);
		
		//이미 정수로 저장괸 값을 cpu가 가져다가 실수 연산을 하고 싶은 경우
		//cpu가 정수를 실수로 변환해서 할 수 있음.
		//강제타입변환 (강제형 변환) ==? (강제로 바꾸고 싶은 타임)변수명
		System.out.println(x / (double)y);
		

	}

}
