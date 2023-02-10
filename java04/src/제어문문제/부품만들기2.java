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
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class 부품만들기2 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 520);
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		JLabel t = new JLabel();
		ImageIcon icon = new ImageIcon("1.png");
		t.setIcon(icon);
		
		JLabel t1 = new JLabel();
		t1.setText("아이디 입력");
		JTextField i1 = new JTextField(10);
		
		JLabel t2 = new JLabel();
		t2.setText("패스워드 입력");
		JTextField i2 = new JTextField(10);
		
		JLabel t3 = new JLabel();
		t3.setText("이름 입력");
		JTextField i3 = new JTextField(10);

		JLabel t4 = new JLabel();
		t4.setText("전화번호 입력");
		JTextField i4 = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("회원가입 처리");
		
		Font font = new Font("나눔스퀘어", 1, 30);
		t1.setFont(font);
		i1.setFont(font);
		t2.setFont(font);
		i2.setFont(font);
		t3.setFont(font);
		i3.setFont(font);
		t4.setFont(font);
		i4.setFont(font);
		b1.setFont(font);
		
		
		t1.setForeground(Color.blue);
		i1.setForeground(Color.black);
		i1.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		i2.setForeground(Color.black);
		i2.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		i3.setForeground(Color.black);
		i3.setBackground(Color.yellow);
		t4.setForeground(Color.blue);
		i4.setForeground(Color.black);
		i4.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);
		
		
		f.add(t);
		f.add(t1);
		f.add(i1);
		f.add(t2);
		f.add(i2);
		f.add(t3);
		f.add(i3);
		f.add(t4);
		f.add(i4);
		f.add(b1);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = i1.getText();
				String pw = i2.getText();
				String name = i3.getText();
				String call = i4.getText();
				
				JOptionPane.showMessageDialog(f, "아이디: "  + id + "\n" + "비밀번호: " + pw + "\n" + "이름: " + name + "\n" + "전화번호: " + call );
				//"\n" 넣어주면 엔터임!
			} 
		});
		
		//보여주는 것은 맨 끝으로!!
		f.setVisible(true);
	}

}
