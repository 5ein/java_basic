package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표JFrame2 {

	public static void main(String[] args) {
		//1. 필요한 부품을 RAM에 가져다 놓자.
		// ==>벽돌처럼!!
		//JFrame 1, FlowLayout 2, Font 2~3,
		//JLabel 7, JButton 3
		//ImageIcon 3 
		
		JFrame f = new JFrame();
		f.setSize(400, 550);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("나눔스퀘어", 2, 20);
		Font font2 = new Font("나눔스퀘어", 1, 30);
		
		JLabel l1 = new JLabel();
		l1.setText("K-pop 인기 투표");
		l1.setFont(font2);
		
		JLabel l2 = new JLabel();
		l2.setText("뉴진스");
		l2.setFont(font1);
		
		JLabel l3 = new JLabel();
		l3.setText("엔믹스");
		l3.setFont(font1);

		JLabel l4 = new JLabel();
		l4.setText("에스파");
		l4.setFont(font1);
		
		JLabel l5 = new JLabel();//뉴진스 투표수 프린트 라벨
		JLabel l6 = new JLabel();//엔믹스 투표수 프린트 라벨
		JLabel l7 = new JLabel();//에스파 투표수 프린트 라벨
		
		l5.setFont(font1);
		l6.setFont(font1);
		l7.setFont(font1);
		l5.setForeground(Color.red);
		l6.setForeground(Color.red);
		l7.setForeground(Color.red);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		ImageIcon icon1 = new ImageIcon("newjeans.png");
		ImageIcon icon2 = new ImageIcon("nmixx.png");
		ImageIcon icon3 = new ImageIcon("aespa.png");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l5);
		
		f.add(b2);
		f.add(l3);
		f.add(l6);
		
		f.add(b3);
		f.add(l4);
		f.add(l7);
		
		b1.addActionListener(new ActionListener() {
			int newjeans = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				newjeans++;
				l5.setText(newjeans + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int nmixx = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				nmixx++;
				l6.setText(nmixx + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int aespa = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				aespa++;
				l7.setText(aespa + "표");
			}
		});
		
		f.setVisible(true);
	}

}
