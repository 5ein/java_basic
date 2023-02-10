package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
//		Scanner 사용
		Scanner sc = new Scanner(System.in);
		
//		1.	정수 5개 크기의 배열을 만든다.
//			10, 20, 30, 40, 50 값을 입력값으로 입력한다.
//			첫번째 값과 세번째 값을 더해서 프린트
		int[] five = new int[5];
		for (int i = 0; i < five.length; i++) { //입력받을때는 for-each안됨!
			System.out.print(i + "번째 값을 입력하시오>> ");
			 five[i] = sc.nextInt();
		}
		System.out.println(five[0] + five[2]);
		
//		2.	스트링 3개크기의 배열을 만든다.
//			자바, 스프링, JSP를 순서대로 입력값으로 입력한다.
//			"자바 보다는 스프링"을 출력 받아라.
		String[] three = new String[3];
		for (int i = 0; i < three.length; i++) {
			System.out.print(i + "번째 글을 입력하시오>> ");
			three[i] = sc.next(); //sc.nextline()은 잘 안씀 next()로 쓰기!!
		}
		System.out.println(three[0] + " 보다는 " + three[1]);
		
		sc.close();
	}

}
