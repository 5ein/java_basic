package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 만들어보세요.
		// 2. 프레임 설정해보세요. 실행해서 눈으로 확인
		// 레이아웃 부품 설정하지 않음.
		// 3. 버튼을 넣을 배열을 먼저 만들어주세요. 500개
		// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요.
		// 심화-1)) 버튼 색을 몇가지 지정해서 임의로 설정, 힌트 Color배열
		// Color[] colors = {Color.blue, Color.white, Color.gray ...}
		// 심화-2)) f에 배경색을 넣어보세요.

		// 1. 프레임을 만들어보세요.
		JFrame f = new JFrame();

		// 2. 프레임 설정해보세요. 실행해서 눈으로 확인
		f.setSize(500, 500);

		// 레이아웃 부품 설정하지 않음.
		f.setLayout(null);

		// 3. 버튼을 넣을 배열을 먼저 만들어주세요. 500개
		JButton[] buttons = new JButton[200];
		// 참조형은 배열에 null로 초기화 {null, null, null, ...};

		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요.
		Random r = new Random(42);

		// 심화-1))
		Color[] colors = { Color.black, Color.gray, Color.DARK_GRAY, Color.LIGHT_GRAY };
		// colors[r.nextInt(colors.length)]

		// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "번 버튼"); // 가로안에 i만 쓸수없음
			// 저안에는 string 이 들어가야하기때문에 i + " " 이런식으로 해주면됨
			int x = r.nextInt(400);
			int y = r.nextInt(480);

			buttons[i].setBounds(x, y, 100, 20);

			// 심화-1))
			buttons[i].setBackground(colors[r.nextInt(colors.length)]);

			buttons[i].setForeground(Color.white);

			f.add(buttons[i]);
		}

		// 심화-2))
		f.getContentPane().setBackground(Color.white);

		// 2. 프레임 설정해보세요. 실행해서 눈으로 확인
		f.setVisible(true);
	}

}
