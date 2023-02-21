package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		// FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout()); // 여기다가 한번 넣고 끝내도 되면 위에꺼 쓰지않고 여기다 바로 넣기!
		
		f.add(new JButton("나는 버튼")); //Component <- JButton(자동형변환)
		f.add(new JLabel("나는 라벨"));
		f.add(new JTextField(10));
		//위처럼 한번에 적는것 단점: 백그라운드 색상, 폰트등의 스타일을 넣기 힘듬
		
		
		f.setVisible(true);
	}

}
