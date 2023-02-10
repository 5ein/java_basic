package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (;;) { // 무한 루프(반복), while(true)
			System.out.println("무한 루프는 잘 쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요?? y를 입력");
			// == 연산자는 기본데이어만 비교 가능
			// String부품에서 제공하는 기능을 사용해서 비교해주어야 함.
			if (data.equals("y")) {
				System.out.println("안녕히가세요!!");
				break; // 이 브레이크는 if문이 아니라 for문의 브레이크다. if는 자동으로 브레이크가 있기 때문.
			}
		}

	}

}
