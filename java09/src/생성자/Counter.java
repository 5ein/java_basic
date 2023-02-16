package 생성자;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int num = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(520, 400);
		f.getContentPane().setBackground(Color.lightGray);
		f.setTitle("카운터");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("나눔스퀘어라운드 Regular", Font.BOLD, 30);
		Font font1 = new Font("나눔스퀘어라운드 Regular", Font.BOLD, 250);

		JButton sum = new JButton("1더하기");
		sum.setFont(font);
		sum.setBackground(Color.gray);

		JButton reset = new JButton("0으로 초기화");
		reset.setFont(font);
		reset.setBackground(Color.DARK_GRAY);
		reset.setForeground(Color.white);

		JButton minus = new JButton("1빼기");
		minus.setFont(font);
		minus.setBackground(Color.gray);

		JLabel number = new JLabel("0");
		number.setFont(font1);
		number.setForeground(Color.red);

		sum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num++;
				number.setText(num + "");
			}
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num = 0;
				number.setText(num + "");
			}
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num--;
				number.setText(num + "");
			}
		});

		f.add(sum);
		f.add(reset);
		f.add(minus);
		f.add(number, BorderLayout.CENTER);

		f.setVisible(true);
	}

}
