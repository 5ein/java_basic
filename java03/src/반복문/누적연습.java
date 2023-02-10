package 반복문;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class 누적연습 {

	public static void main(String[] args) {
		// iu = iu + 1; == iu++;
		// sum = sum + i;

		// 1. 숫자누적
		int sum = 0; // 변수의 초기화 반드시 해주세요!!
		for (int i = 1; i <= 1000; i++) { // 500500
			sum = sum + i;
			// System.out.println("현재까지의 합>> " + sum);
		}
		System.out.println("전체 합은>> " + sum);

		// 2. 글자누적
		String sum2 = ""; // String의 초기값은 ""(빈공간) 또는 null 이 들어감
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}

}
