package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? ");
		String name = sc.next();
		
		System.out.print("나의 나이는? ");
		int age = sc.nextInt();
		int newAge = age + 1;
		
		System.out.print("나의 키는? ");
		Double height = sc.nextDouble();
		Double newHeight = height + 10;
		
		System.out.print("나의 몸무게는? ");
		Double weight = sc.nextDouble();
		Double newWeight = weight - 10;
		
		
		System.out.print("저녁을 먹었나요?(true/false) ");
		boolean dinner = sc.nextBoolean();
		
		System.out.print("나의 좌우명은? ");
		sc.nextLine();
		String text = sc.nextLine(); 
		
		System.out.println("-----------------------------");
		
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 나이는 " + newAge + "입니다.");
		System.out.println("내 내년 키는 " + newHeight + "입니다.");
		System.out.println("내 내년 몸무게는 " + newWeight + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은 " + text + "입니다.");
		
		sc.close();
	}

}
