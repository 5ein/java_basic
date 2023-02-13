package 배열복습;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//import javax.swing.JOptionPane;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렳을 할 때는 Arrays
		Random r = new Random(42); // 씨앗값(seed)
		int[] jumsu = new int[10000];

		// for: 입력, 출력, i활용 가능!
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1; // 1~1000
		}

		// for-each: 알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다.!!
		// 출력용! 싷무에서 많이 씀!!
		for (int x : jumsu) {
			System.out.println(x);
		}

		// 오름차순(작-->큰), 내림차순(큰-->작)
		Arrays.sort(jumsu); // 얘는 오름차순!!
		// sort(jumsu) ==> jumsu가 바뀌어버림(원본이 파괴) =>ram을 변경시킴
		// 파괴형 함수

//		String n = JOptionPane.showInputDialog("숫자입력");
//		int n2 = Integer.parseInt(n);
		// parseInt(n) ==> ram에 저장된 n이 변경된 건 아님(원본 비파괴)
		// 비파괴형 함수!!

		System.out.println("------------------");

		// 정렬 후, 확인
		for (int x : jumsu) {
			System.out.println(x);
		}

		// 정렬 후, 최대값, 최소값을 프린트
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length - 1]);

		// 10000명 중 상위30% = 인원 3000명, 높은 점수부터 3000개 추출
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i]; // == sum += jumsu[i];
		}
		System.out.println("상위 30%의 평균: " + (sum30 / 3000.0));

		// 하위 30% 의 평균?
		int sum0 = 0;
		for (int i = 0; i < 3000; i++) {
			sum0 += jumsu[i]; // == sum0 = sum0 + jumsu[i];
		}
		System.out.println("하위 30%의 평균: " + (sum0 / 3000.0));

		// arrys. 에 이런 기능도 있고 다른기능도 많아!!
		String result = Arrays.toString(jumsu); // 비파괴형, String
		System.out.println(result);

//======================================================================
		// 내림차순
		// 객체 생성
		Random random = new Random(42);

		// 변수
		int[] scores = new int[10000]; // 점수를 담을 변수
		int sum = 0; // 점수 총 합
		int count = 0; // 학생 수
		double avg = 0.0; // 점수 평균

		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(451);
		}

		// 정렬하기 위해 Integer 타입으로 변환
		Integer[] convertScores = Arrays.stream(scores).boxed().toArray(Integer[]::new);

		// 내림차순 정렬
		Arrays.sort(convertScores, Collections.reverseOrder());

		for (int i = 0; i < (convertScores.length * 0.3); i++) {
			count++;
			sum += convertScores[i];
		}

		// 평균
		avg = (double) sum / count;

		System.out.println("30% 인원의 수는 " + count + "명입니다.");
		System.out.print("30% 인원의 평균은 " + avg + "점입니다.");

	}
}
