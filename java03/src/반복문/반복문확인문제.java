package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); // 창띄우기
		f.setSize(330, 350); // 창크기 설정

		// JFrame에는 setbackground 대신 저거 해야해
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("별 10개");
		JButton b2 = new JButton();
		b2.setText("커피*5");
		JButton b3 = new JButton();
		b3.setText("커피*우유3");
		JButton b4 = new JButton();
		b4.setText("1:짱!");

		Font font = new Font("나눔스퀘어", 1, 25);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 1)버튼에다가 액션기능을 추가 하겠다고 설정
		// 2)클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩해주면 됨.
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 떄 처리 내용을 여기에 써주세요!!
				System.out.println("b1을 클릭했음.");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println(); //한줄 엔터 넣어줌
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 떄 처리 내용을 여기에 써주세요!!
				System.out.println("b2를 클릭했음.");
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println(); //한줄 엔터 넣어줌
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 떄 처리 내용을 여기에 써주세요!!
				System.out.println("b3를 클릭했음.");
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 떄 처리 내용을 여기에 써주세요!!
				System.out.println("b4를 클릭했음.");
				for (int i = 0; i < 10; i++) {
					System.out.println((i + 1) + " : 짱!");
					// 얘는 앞에서부터 연산되기 때문에 괄호를 안넣어도 되긴함
				}
			}
		});

		f.setVisible(true); // 정말 창띄워? true 항상 맨마지막 줄!!
	}

}
