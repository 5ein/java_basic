package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자.
		// 틀!!이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립!
		// new JFrame()는 JFrame이라는 틀을 이용해서 부품을 찍어내라는 뜻
		// 만든 부품은 모두다 ram에 저장되어야 한다.
		// f변수 만들어서 부품을 넣어주세요.
		// f에는 JFrame이 저장되어야 함.
		JFrame f = new JFrame(); // f라는 프레임만들기
		f.setSize(850, 900);

		// 물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야함.
		// FlowLayout
		FlowLayout flow = new FlowLayout();

		// f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);

		JButton b1 = new JButton(); // 버튼만들기
		b1.setText("나는 버튼1");

		JButton b2 = new JButton(); // 버튼만들기
		b2.setText("나는 버튼2");

		JLabel text1 = new JLabel(); // 글자 넣기
		text1.setText("아이디");

		JLabel text2 = new JLabel();
		text2.setText("패스워드");

		// 글자 입력받는것 만들기
		JTextField input1 = new JTextField(10); // 가로안에 몇글자까지 가늘할지 적는것
		JTextField input2 = new JTextField(10); // 가로안에 몇글자까지 가늘할지 적는것

		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);

		b1.setBackground(Color.red); // 배경색
		b1.setForeground(Color.white); // 버튼위색, 글자색
		b2.setBackground(Color.red); // 배경색
		b2.setForeground(Color.white); // 버튼위색, 글자색
		input1.setBackground(Color.blue); // 배경색
		input1.setForeground(Color.white); // 버튼위색, 글자색
		input2.setBackground(Color.blue); // 배경색
		input2.setForeground(Color.white); // 버튼위색, 글자색

		// no.png 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식!
		ImageIcon icon = new ImageIcon("no.jpg");
		ImageIcon icon2 = new ImageIcon("ok.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);

		f.add(text1);
		f.add(input1);
		f.add(b1); // f프레임에 버튼 추가
		f.add(text2);
		f.add(input2);
		f.add(b2); // f프레임에 버튼 추가

		// 보여주는 것은 맨 끝으로!!
		f.setVisible(true);
	}

}
