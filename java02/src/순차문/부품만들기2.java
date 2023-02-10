package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		
		//JFrame부품을 만들어 램에 저장
		JFrame h = new JFrame(); //ram에 저장
		h.setSize(450, 150);
		
		FlowLayout flow = new FlowLayout();
		
		h.setLayout(flow);
		
		//JButton부품을 만들어 램에 저장
		JButton button = new JButton();
		button.setText("버튼");
		
		JLabel lable = new JLabel();
		lable.setText("안녕하세요");
		
		JTextField field = new JTextField(10);
		
		Font font = new Font("궁서", 2, 20);
		lable.setFont(font);
		field.setFont(font);
		button.setFont(font);
		
		lable.setBackground(Color.gray); //바탕색
		lable.setForeground(Color.green); //글자색
		field.setBackground(Color.pink); //빈칸 색
		button.setBackground(Color.white); //버튼 배경색
		button.setForeground(Color.blue); //글자색
		
		h.add(lable);
		h.add(field);
		h.add(button); //JFrame에 버튼을 추가
		
		//버튼이 추가된 JFrame을 화면에 보여주세요.
		h.setVisible(true);
		
		
	}

}
