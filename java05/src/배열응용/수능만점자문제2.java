package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자문제2 {

	public static void main(String[] args) {

//		1) 수능 10000명의 점수를 처리!
		int[] jumsu = new int[10000];

//		2) 랜덤으로 10000명의 넣어주세요.
		Random r = new Random(42);

//		3) 점수대 0~450
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
		}

////		4) 만점자가 몇 명인지?? 누구인지(인덱스)
//		int count = 0;
//		System.out.print("만점자 번호는 >> ");
//		for (int i = 0; i < jumsu.length; i++) {
//			if (jumsu[i] == 450) {
//				count++;
//				System.out.print(i + "번, ");
//			}
//		}
//		System.out.println();
//		System.out.println("총 " + count + "명 입니다.");
//
////		5) 0점이 몇 명인지??
//		int count1 = 0;
//		System.out.print("0점자 번호는 >> ");
//		for (int i = 0; i < jumsu.length; i++) {
//			if (jumsu[i] == 0) {
//				count1++;
//				System.out.print(i + "번, ");
//			}
//		}
//		System.out.println();
//		System.out.println("총" + count1 + "명 입니다.");
//
////		6) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
//		int sum = 0;
//		for (int i = 0; i < jumsu.length; i++) {
//			sum = sum + jumsu[i];
//		}
//		double mean = (double) sum / jumsu.length;
//		System.out.println("수능 점수의 평균은: " + mean + "점 입니다.");
//
////		7) 심화)) 평균보다 +-50점 인 학생 카운트(포함) >=
//		int count3 = 0;
//		for (int i = 0; i < jumsu.length; i++) {
//			if ((jumsu[i] <= (mean + 50)) && (jumsu[i] >= (mean - 50))) {
//				count3++;
//			}
//		}
//		System.out.println("평균의 +-50점인 학생의 수는: " + count3 + "명 입니다.");

//		8) 심화)) 상위 30%의 점수 ?? (100의 30%이면 30...)
		// 10000명의 상위 30% 는 3000명

		int[] rank = new int[10000];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < rank.length; j++) {
				if (jumsu[i] < jumsu[j]) {
					rank[i]++;
				}
			} // for
			if (rank[i] <= 300) {
				System.out.print(i + "학생 " + rank[i] + "등 " + jumsu[i] + "점, ");
			}
		} // for
		System.out.println();
		
		
//		8) 심화)) 상위 30%의 점수 ?? (100의 30%이면 30점...)
		// 10000명의 상위 30% 는 3000명, 각 점수, 평균
		Arrays.sort(jumsu); //이게 순서대로 나열할때 사용되는 것이래
//		for (int i = 0; i < jumsu.length; i++) {
//			System.out.println(i + ":" + jumsu[i]);
//		}
		//9999-3000 = 7000
		int 숫자 = 3001;
		int 합계 = 0;
		for (int i = 7000; i < 10000; i++) {
//			System.out.println(i + ":" + jumsu[i]);
			숫자--;
			합계 = 합계 + jumsu[i];
			System.out.println(숫자 + ": " + jumsu[i]);
		}
		System.out.println("30% 평균은 " + (double)합계/3000);
		System.out.println(숫자);
		
	}
}
