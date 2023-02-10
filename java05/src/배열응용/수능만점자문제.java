package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
//		0) 수능 10000명의 점수를 처리!
//		0) 랜덤으로 10000명의 넣어주세요.
//		0) 0~450
//		1) 만점자가 몇 명인지?? 누구인지(인덱스)
//		2) 0점이 몇 명인지??
//		3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
//		4) 심화)) 평균보다 +-50점 인 학생 카운트(포함) >=
//		5) 심화)) 점수의 상위 30% ?? (100의 30%이면 30점...)
		
		
//		0) 수능 10000명의 점수를 처리! ==> 배열 필요!!
		int[] jumsu = new int[10000];
		// jumsu = { 0		, 0		, 0, 0, 0, .......};
		// 주소		 jumsu[0] jumsu[1]
		
//		0) 랜덤으로 1000명의 점수 넣어주세요. ==> Random 필요!!
		Random r = new Random(42);
		
//		1)	만점자가 몇 명인지>> 누구인지(인덱스)
		int best = 0;
		for (int i = 0; i < jumsu.length; i++) {
//		0) 점수 범위: 0~450 점
			jumsu[i] = r.nextInt(451); //0-450
			if (jumsu[i] == 450) {
				best++;
			}
		}//for
		System.out.println("만점자는 총 "+ best +"명 입니다.");
		
		System.out.print("만점자는: ");
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 450) {
				best++;
				System.out.print(i + "번 수험생, ");
			}
		}//for
		System.out.println();
		
		
//		2)	0점이 몇 명인지??
		int worst = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 0) {
				worst++;
			}
		}//for
		System.out.println("0점자는 총 "+ worst +"명 입니다.");
		
		
//		3)	평균은 어떻게 되었는지?? 합계를 먼저 구해야함
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}//for
		double avg = sum / jumsu.length; 
		System.out.println("평균은: " + avg);
		
		
//		4)	심화 - 평균보다  +-50점 인 학생 카운트(포함) >=
		int some = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] <= (avg + 50) && jumsu[i] >= (avg - 50)) {
				some++;
			}
		}//for
		System.out.println("평균보다 +_50 인 학생의 수: " + some);
		
		//5) 심화)) 점수의 상위 30% ??
		//100의 30%이면 30점...
		
		
		
//		//위에꺼랑 같건데 다른모양 (강사님 답)
//		//0) 수능 10000명의 점수를 처리! ==> 배열 필요!!
//		int[] jumsu = new int[10000];
//		//jumsu = { 0		, 0		, 0, 0, 0, .......};
//		// 주소		 jumsu[0] jumsu[1]
//		
//		//0) 랜덤으로 1000명의 점수 넣어주세요. ==> Random 필요!!
//		//Random r = new Random(42);
//		int best = 0;
//		int worst = 0;
//		for (int x : jumsu) {
//			//점수가 450과 동일한지 체크해서 true이면 카운트 증가하면됨
//			if (x == 450) {
//				best++;
//			}//if
//			if (x == 0) {
//				worst++;
//			}//if
//		}//for
//		System.out.println("수능 만점자: " + best + "명");
//		System.out.println("수능 o점자: " + worst + "명");
//		
//		//3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
//		int sum = 0;
//		for (int x : jumsu) {
//			sum = sum + x; //sum += x;
//		}
//		double avg = sum / jumsu.length; 
//		System.out.println("전체수험생의 평균은 " + avg);
//		
//		
//		//4) 심화)) 평균보다 +-50점 인 학생 카운트(포함, >=)
//		int avgPlusMinus = 0; //선언!할때 자바는 변수를 만들어준다.!!
//		//avg = 300인경우 : 250~350
//		//avg-50 <= jumsu[i] <= avg+50
//		for (int x : jumsu) {
//			if ((avg-50 <= x) && (x <= avg+50)) {
//				avgPlusMinus++;
//			}
//		}//for
//		System.out.println("평균 범위에 있는 수험생수는 " + avgPlusMinus + "명");
		
	}

}
