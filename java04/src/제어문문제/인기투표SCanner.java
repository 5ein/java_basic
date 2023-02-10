package 제어문문제;

import java.util.Scanner;

public class 인기투표SCanner {

	public static void main(String[] args) {
		
		int newjeans = 0, nmixx = 0, aespa = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표 시스템\n===========");

		while (true) {
			System.out.print("(1)뉴진스, (2)엔믹스, (3)에스파, (4)종료 >> ");
			int target = sc.nextInt();//"2"-->2
			if (target == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (target == 1) {
				newjeans++;
			} else if (target == 2) {
				nmixx++;
			} else if (target == 3){
				aespa++;
			} else {
				System.out.println("해당 번호가 없습니다.");
			}
		}
		
		sc.close();
		
		System.out.println("투표 결과는 " + "뉴진스  " + newjeans + "표, 엔믹스 " + nmixx + "표, 에스파 " + aespa + "표 입니다." );
	}

}
