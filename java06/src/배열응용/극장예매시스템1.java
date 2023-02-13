package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // 밑에처럼 따로 안하고 이 가로안에 타이틀 적어도 됨.
		f.setTitle("극장 예매 시스템");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		// 배치해주는 부품 - FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 추가한 순서대로 f에 붙는다.
		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[150];
		Font font = new Font("12롯데마트드림Medium", Font.BOLD, 20);
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.white);
		result.setFont(font);
		// 예약 여부를 저장하는 배열을 만들어 줍시다.!1
		int[] seat = new int[150]; // {0, 0, 0, 0,};
		// 각 자리에 저장된 값이 0이면 아직 예매 안되었음. 예약 되면 1로 바꿈!
		// 반복해서 배열에 버튼 만들어 넣어주세요.
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			// 반복해서 f에 add해주세요.
			f.add(btn[i]);
			// 버튼에 액션기능 add해보자.
			// 1) 액션 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					// e.getActionCommand(); 클릭한 버튼 위의 글자를 가지고 와줌.
					String text = e.getActionCommand(); //"0"
					System.out.println(text);
					int no = Integer.parseInt(text);
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 에매가능!!
					if (seat[no] == 1) { // 이미 예약되어 1이 들어있음
						result.setText(text + "번 예매불가");
						result.setForeground(Color.red);
					} else { // 아직 예약이 안되어서 0이 들어있음.예약가능
						seat[no] = 1;// 예매 좌석은 1로 변경!
						result.setText(text + "번 예매완료.");
					}
				}
			});
		}
		f.add(result);
		JButton total = new JButton("전체 예매 내역");
		total.setBackground(Color.white);
		total.setForeground(Color.blue);
		total.setFont(font);
		f.add(total);
		total.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 값이 1인지 체크해서 카운트
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} // if
				} // for
					// 영화예매비 1장당 1만원, 결제금액 프린트
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
			}
		});
		// 맨 끝에 있어야 함.
		f.setVisible(true);
	}
}