package 확인문제;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
//		1. 입력
//		오늘은 무슨 요일인가요? 월요일
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일일까요?");

//		수업 끝나고 무엇을 하실 예정인가요? 놀기
		String doing = JOptionPane.showInputDialog("오늘 수업 끝나고 무엇을 하실 예정인가요?");
				
//		2. 처리
//		오늘 월요일에 수업후 나는 놀기할 예정
		String result = "오늘 " + today + "에 수업후 나는 " + doing +"할 예정입니다.";		

//		3.출력
//		처리한 내용을 출력해주세요
		System.out.println(result);

	}

}
