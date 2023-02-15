package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	
	static int index = 2; //현재 2부터 시작
	
	public static void main(String[] args) {
		String[] title = {"상견니", "아바타: 물의 길", "타이타닉", "장화신은 고양이", "너의 이름은."};
		String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		double[] jumsu = { 8.32, 8.65, 9.44, 8.88, 8.81 };
		
		
		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		Font font = new Font("12롯데마트드림Medium", Font.BOLD, 40);
		//객체 생성을 하는데, 특정한 입력값을 넣지 않으면 않으면 못만들게 할 수 있음(위에 font 처럼)
		Font font2 = new Font("12롯데마트드림Medium", Font.BOLD, 31);
		
		
		//배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
//		BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0); //0으로 하면 가운데로 넣어짐
		top.setForeground(Color.black);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH); //북쪽에 붙어라
		
		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER); //가운데에 붙어라
		
//		String.valueOf() : int, double, ... => String으로 변환
//						   int + ""
//		Integer.parse() : double, String ... => int로 변환
//		Double.parse()  : int, String, ... => double로 변환					
							
		
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		//얘는 string만 들어가서 (String.valueOf()는 스트링으로 바꿔주는것!)얘사용하거나 (배열에서 +"" 해주기)
		under.setHorizontalAlignment(0); //0으로 하면 가운데로 넣어짐
		top.setForeground(Color.white);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH); //남쪽에 붙어라
		
		JButton left = new JButton("왼  쪽");
		left.setBackground(Color.DARK_GRAY);
		left.setForeground(Color.white);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);
		
		//액션처리 하는 방법  
		//1)액션기능을 add 
		//2)클릭액션이 있을 때 처리할 부품을 만들어주세요.
		//3)클릭 액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--; //index = index - 1; index -= 1; 다 같은 뜻 (맨앞애는 1씩증감일때만 가능)
				} else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
					//index = 4; //이것만하면 버튼 한번눌릴때 멈췄다가 됨
				}
			
			}
		});
		
		
		JButton right = new JButton("오른쪽");
		right.setBackground(Color.DARK_GRAY);
		right.setForeground(Color.white);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++; //index = index + 1; index += 1; 다 같은 뜻 (맨앞애는 1씩증감일때만 가능)
				} else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
					//index = 0; //이것만하면 버튼 한번눌릴때 멈췄다가 됨
				}
			}
		});
		
		
		//프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		f.setVisible(true);
		
	}

}
