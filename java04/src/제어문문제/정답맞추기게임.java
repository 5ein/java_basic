package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {

		// int target = 77;
		// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꾸세요.
		Random r = new Random();
		int target = r.nextInt(100); // 0~99

		Scanner sc = new Scanner(System.in);

		int data = 0;
		// 3. 전체 시도 횟수 카운트
		int count = 0;
		while (true) { // while에 true 넣으면 break 나오가 전까지 무한루프
			System.out.print("생각한 정답은??");
			data = sc.nextInt();
			if (data == target) {
				count++;
				System.out.println(count + "번째 시도: " + "정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				break; // 중요!!
			} else {
				count++;
				System.out.println(count + "번째 시도: " + "오답입니다.");

				// 1. 힌트주세요.
				// data가 target보다 크면 "너무커요"
				// data가 target보다 크면 "너무작아요"
				if (data > target) {
					System.out.print("정답보다 커요! ");
				} else {
					System.out.print("정답보다 작아요! ");
				}

				System.out.println("다시 시도해주세요.");
			}
		}

		sc.close();
	}

}
