package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 450);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setLayout(new FlowLayout());
		Font font = new Font("나눔스퀘어", Font.BOLD, 40);
		
		JButton b1 = new JButton("카카오");
		b1.setFont(font);
		b1.setBackground(Color.pink);
		//액션기능 
		//1) 액션기능 추가
		//2) 클릭했을 때 누가 담당할지 부품을 만들어주세요.
		//3) 클랙했을 때 어떻게 처리할 지를 코딩
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//처리내용
				//에스엠 코드 041510를 주면서
				//크롤링하는 부품에게 크롤링 기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("041510");
				System.out.println("---------------------------");
			}
		});
		
		JButton b2 = new JButton("에스엠");
		b2.setFont(font);
		b2.setBackground(Color.orange);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//처리내용
				//카카오 코드 035720를 주면서
				//크롤링하는 부품에게 크롤링 기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035720");
				System.out.println("---------------------------");
			}
		});
		
		JButton b3 = new JButton("네이버");
		b3.setFont(font);
		b3.setBackground(Color.yellow);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//처리내용
				//네이버 코드 035420를 주면서
				//크롤링하는 부품에게 크롤링 기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035420");
				System.out.println("---------------------------");
			}
		});
		
		JLabel label = new JLabel("CODE");
		label.setFont(font);
		
		JTextField text = new JTextField(7);
		text.setFont(font);
		
		JButton b4 = new JButton("크롤링시작");
		b4.setFont(font);
		b4.setBackground(Color.darkGray);
		b4.setForeground(Color.white);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String code1 = text.getText();
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver(code1);
				System.out.println("---------------------------");
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		f.setVisible(true);
	}

}
