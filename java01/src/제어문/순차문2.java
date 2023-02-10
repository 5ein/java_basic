package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//1.입력
		//당신이 좋아하는 운동은? 헬스
		String exercies = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");

		//당신이ㅣ 운동하기 좋아하는 요일은?
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");		
		
		//2.처리
		//저는 금요일에 헬스를 합니다.
		String result = "저는 " + day + "에 " + exercies + "를 합니다.";
		
		//3.출력
		System.out.println(result);

	}

}
