package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기부품만들기 {

	public static void main(String[] args) {
		// 필요한 부품 10개 => RAM에 부품을 만들어 넣어놓자.
		
//		new + 컨트롤 + 스페이스바 했을때 파란색 누르면 자동 완성!!!
		
		// JFrame, ImageIcon, JLabel 3개
		JFrame f = new JFrame();
		f.setSize(300, 350);
		
		ImageIcon icon = new ImageIcon("Calculator.jpg");
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		
		// JTextField 2개
		JTextField text1 = new JTextField(10); //10은 가로크기
		JTextField text2 = new JTextField(10);
		
		// Font, FlowLayout
		Font font = new Font("굴림", 1, 20);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);		
		
		// JButton
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setBackground(Color.white);
		label2.setForeground(Color.black);
		label3.setForeground(Color.black);
		text1.setBackground(Color.darkGray);
		text1.setForeground(Color.white);
		text2.setBackground(Color.darkGray);
		text2.setForeground(Color.white);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		b3.setBackground(Color.gray);
		b3.setForeground(Color.white);
		b4.setBackground(Color.gray);
		b4.setForeground(Color.white);
		
		//위에 있는 설정 그대로 frame을 보여주라! 맨 아래에 써야함!!
		f.setVisible(true);
	}

}
