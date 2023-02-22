package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 200);
		
		JButton b = new JButton("나를 눌러"); //왼쪽처럼! 버튼이 만들어진 이후 버튼액션을 추가 할수있음.
		
		b.addActionListener(new ActionListener() { //ActionListener는 인터페이스
			//new 다음에는 무조건 틀래스가 와야함 (인터페이스는 올수 없음 => 익명클래스로 만들어줌)
			//ActionListener 자체는 인터페이스고 ActionListener(){~}는 클래스로 보는건가요?
			//인터페이스긴 한데..{}안에 override 해서 내용울 구체적으로 구현을하면 이름없는 클래스가 된다.=(익명클래스)
			//이름을 따로 만들지 않고 밑에다가 바로 액션처리를 하고싶을때 사용함. (익명클래스)
			@Override
			public void actionPerformed(ActionEvent e) {
				//인터페이스에 반드시 actionPerformed()를 쓰라고 규칙이 정해져 있기 때문에 바꾸면 안됨!, void도 publlic도
				// 처리할 내용을 코딩하는 부분
				System.out.println("버튼이 클릭되었음.");
			}
		}); //익명클래스 끝
		
		
		f.add(b);

		f.setVisible(true);
	}

}
