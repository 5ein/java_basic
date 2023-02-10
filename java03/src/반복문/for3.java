package 반복문;

public class for3 {

	public static void main(String[] args) {

		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		
		System.out.println(); //한줄 엔터 넣어줌
		
		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}

		System.out.println(); //한줄 엔터 넣어줌
		
		// 3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		
		// 4.
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + " : 짱!"); 
			//얘는 앞에서부터 연산되기 때문에 괄호를 안넣어도 되긴함
		}

	}

}
