package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력: 많은 양의 저장공간 (배열, 2개)
		// 배열 하나당 990개의 저장공간 필요
		// ==> 실제 생성된 저장공간 개수? (990 + 1 + 1) * 2 
		//				(값들어가는부분 + 위치값 부분 + 변수)
		//		랜덤으로 데이터를 입력(Random)
		//		반복문으로 배열 위치(인덱스)를 옮기면서 데이터를 넣자.
		//실무에서는 한글을 절때 쓰지않음
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
//		System.out.println(답안지);
//		System.out.println(내답안);
		
		Random r = new Random(42); //벽돌을 사용만들기
		for (int i = 0; i < 답안지.length; i++) {
			답안지[i] = r.nextInt(4) + 1; //0~3 3 ==> 1~4
			내답안[i] = r.nextInt(4) + 1; //0~3 3 ==> 1~4
		}
		
		//확인!!
		System.out.println("번호:\t답안\t내답");
		System.out.println("--------------------------");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println("i:\t" + 답안지[i] + "\t<->\t" + 내답안[i]);
		}
		
		
		// 처리
		// 두배열의 같은 인덱스가 같은 문항을 비교!!
		// 동일하면 1점씩 획득
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지[i]) {
				jumsu++;
			}//if
		}//for
		
		
		// 출력
		System.out.println("토익점수는 " + jumsu + "점");
		
	}

}
