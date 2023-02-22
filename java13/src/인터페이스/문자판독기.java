package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.getContentPane().setBackground(Color.darkGray);
		//1. flow를 만들어주고, 아래코드에서 flow를 쓰는 경우
		//FlowLayout flow = new FlowLayout();
		//f.setLayout(flow);
		//2. 한번쓰고 아래 코드에서 쓸일이 없는 경우
		f.setLayout(new FlowLayout());
		
		Font font = new Font("나눔스퀘어", Font.BOLD, 30);
		
		JLabel label = new JLabel("문장을 넣으세요.");
		JTextArea area = new JTextArea(6, 10); //세로 6줄에, 가로넓이 10
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색바꾸기");
		JButton b3 = new JButton("글자색바꾸기");
		
		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		b1.setBackground(Color.gray);
		b2.setBackground(Color.gray);
		b3.setBackground(Color.gray);
		label.setForeground(Color.white);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		
		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		// 1. text.length():글자수 구해줌.
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText(); //입력한 문장 가져오기
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
				area.setText(""); //버튼누르고 JOptionPane뜬 뒤 글자들이 다 지워지게 만듬
			}
		});//익명클래스 끝
		
		// 2. area.setBackground(Color.lightGray);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.lightGray);
			}
		});//익명클래스 끝
		
		// 3. area.setForeground(Color.white);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.white);
			}
		});//익명클래스 끝
		
		
		f.setVisible(true);
	}
}
