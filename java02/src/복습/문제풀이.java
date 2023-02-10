package 복습;

import java.util.Date;

public class 문제풀이 {

	public static void main(String[] args) {

		// 1
		Date date = new Date();

		int year = date.getYear() + 1900;
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}

		// 2
		int day = date.getDay();

		switch (day) {
		case 0:
		case 6:
			System.out.println("쉬자");
			break;
		default:
			System.out.println("열~~심히 공부하자");
			break;
		}
		
		//3
		int month = date.getMonth() + 1;
		switch (month) {
		case 2:
			System.out.println("28일 까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지");
			break;
		default:
			System.out.println("31일 까지");
			break;
		}

		// 누가 for문으로 만들었대서 해본거
		for (int month1 = 1; month1 < 13; month1++) {
			if (month1 == 2) {
				System.out.println(month1 + "월은 28일 까지");
			} else if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11) {
				System.out.println(month1 + "월은 30일 까지");
			} else {
				System.out.println(month1 + "월은 31일 까지");
			}
		}
	}

}
