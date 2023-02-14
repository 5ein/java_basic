package 부품응용하기;

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

public class 로그인화면 {

	public static void main(String[] args) {
		// font, flowlayout
		// jframe, imageicon3개, imagelabel
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인버튼, reset버튼

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("12롯데마트행복Medium", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아  이  디  : ");
		JLabel pw = new JLabel("패 스 워 드 : ");
		id.setFont(font);
		pw.setFont(font);
		id.setForeground(Color.white);
		pw.setForeground(Color.white);

		ImageIcon icon1 = new ImageIcon("diary.jpg");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);
		idText.setBackground(Color.darkGray);
		idText.setForeground(Color.white);
		pwText.setBackground(Color.darkGray);
		pwText.setForeground(Color.white);
		idText.setHorizontalAlignment(JTextField.CENTER);
		pwText.setHorizontalAlignment(JTextField.CENTER);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.gray);
		reset.setBackground(Color.gray);

		// 1) 버튼에 액션기능을 add
		// 2) 클릭했을 때 "어떤 부품이" 처리를 담당할지 new로 만들어주세요.
		// 3) 클릭했을 때 "어떻게 처리할지를" 써주세요.
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백을 넣어라.!
				idText.setText("");
				pwText.setText("");
			}
		}); // reset add end

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// idText, pwText에 getText()
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				// root/1234인지 비교해서 로그인 성공/실패 joptionpane으로 출력
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					
					//일기쓰기 부품의 open()기능 쓰자!!
					일기쓰기 diary = new 일기쓰기();
					diary.open(); //메서드 사용 ==> 메서드 호출!!
					f.setVisible(false); //이거하면 성공했을때 이창이 안보이게 만듬!

				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		}); // login add end

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);
	}

}