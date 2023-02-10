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

public class 인기투표JFrame {

	public static void main(String[] args) {
		
		
		JFrame f = new JFrame();
		f.setSize(450, 600);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("나눔스퀘어", 1, 30);
		Font font2 = new Font("나눔스퀘어", 1, 20);
		Font font3 = new Font("나눔스퀘어", 2, 20);

		JLabel text = new JLabel(); //글씨
		text.setText("4세대 K-pop 걸그룹 인기 투표");
		text.setFont(font1);
		
		JButton b1 = new JButton();
		JLabel text1 = new JLabel();
		JLabel text11 = new JLabel(); 
		ImageIcon icon1 = new ImageIcon("newjeans.png");
		b1.setIcon(icon1);
		text1.setText("1. 뉴진스");
		text1.setFont(font2);
		text11.setFont(font3);
		text1.setForeground(Color.black);
		text11.setForeground(Color.red);
		
		JButton b2 = new JButton();
		JLabel text2 = new JLabel(); 
		JLabel text22 = new JLabel(); 
		ImageIcon icon2 = new ImageIcon("nmixx.png");
		b2.setIcon(icon2);
		text2.setText("2. 엔믹스");
		text2.setFont(font2);
		text22.setFont(font3);
		text2.setForeground(Color.black);
		text22.setForeground(Color.red);
		
		JButton b3 = new JButton();
		JLabel text3 = new JLabel(); 
		JLabel text33 = new JLabel(); 
		ImageIcon icon3 = new ImageIcon("aespa.png");
		b3.setIcon(icon3);
		text3.setText("3. 에스파");
		text3.setFont(font2);
		text33.setFont(font3);
		text3.setForeground(Color.black);
		text33.setForeground(Color.red);
		
		f.add(text);
		f.add(b1);
		f.add(text1);
		f.add(text11);
		
		f.add(b2);
		f.add(text2);
		f.add(text22);
		
		f.add(b3);
		f.add(text3);
		f.add(text33);
		
		
		b1.addActionListener(new ActionListener() {
			int newjeans = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				newjeans++;
				text11.setText(newjeans + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int nmixx = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				nmixx++;
				text22.setText(nmixx + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int aespa = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				aespa++;
				text33.setText(aespa + "표");
			}
		});
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
