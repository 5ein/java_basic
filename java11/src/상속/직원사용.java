package 상속;

import 복습.직원; // 이거 해줘야지 다른 패키지에서 사용가능

public class 직원사용 {
	public static void main(String[] args) {
		직원 work = new 직원();

		work.name = "홍길동"; // public

		// work.address = "강남구"; //default
		// ==> 같은 패키지에서만 사용 가능함.!

		// work.salsry = 100; //protected
		// ==> 다른 패키지인 경우 상속관계에서만 됨.!
		
		//work.rrn = "111"; //private
		// ==> 그 클래스에서만 사용 가능함.

	}
}