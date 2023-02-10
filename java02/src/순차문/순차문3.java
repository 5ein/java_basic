package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		//입력
		String height = JOptionPane.showInputDialog("키를 입력하세요");
		String weight = JOptionPane.showInputDialog("몸무게를 입력하세요");
		
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		
		//처리
		double result = weight1 / ((height1 * height1)/100);
		
		//출력
		System.out.println("당신의 BMI는: " + result + "입니다.");
		//창으로 결과 띄우는법
		JOptionPane.showMessageDialog(null, result);
		

	}

}
