package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000]; // 1학기 성적
		int[] n2 = new int[10000]; // 2학기 성적

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0; // 동일한 갯수 누적
		int count2 = 0; // 동일하지 않은 갯수 누적
		int countUp = 0;
		int countDown = 0;
		
		// Surround With : 알트 + 쉬프트 + 제트
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) { //1-2 학기가 같은경우
				count++; //크면카운트!
			} else { //다른경우!!
				count2++; //크지 않으면카운트!
				if (n1[i] < n2[i]) { //2학기가 더 큰경우
					countUp++;
					System.out.println("1학기 성적이 더 큰 학생은 " + i);
				} else if (n1[i] > n2[i]) { //1학기가 더 큰경우
					countDown++;
					System.out.println("2학기 성적이 더 큰 학생은 " + i);
				}
			}
		} // for
		System.out.println("1-2학기 성적이 동일한 학생수>> " + count + "명");
		System.out.println("1-2학기 성적이 동일하지 않은 학생수>> " + count2 + "명");
		System.out.println("2학기에 성적이 더 오른 학생은 몇명?? 누구?? " + countUp + "명");
		System.out.println("1학기에 성적이 더 오른 학생은 몇명?? 누구?? " + countDown + "명");
		
	}

}
