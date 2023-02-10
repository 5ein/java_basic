package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		
		//인기투표해봅시다.!! 10명에게 받아봅시다.!!
		//1)냉면 2)라멘 3)마라탕
		int noodles = 0;
		int ramen = 0;
		int malatang = 0;
		
		for (int i = 0; i < 10; i++) {
			String menu = JOptionPane.showInputDialog("무엇이 가장 먹고싶나요? 1)냉면 2)라멘 3)마라탕");
			if (menu.equals("1")) {
				noodles++;
			} else if (menu.equals("2")) {
				ramen++;
			}else if (menu.equals("3")) {
				malatang++;
			}
		}
		System.out.println("1)냉면: " + noodles);
		System.out.println("2)라멘: " + ramen);
		System.out.println("3)마라탕: " + malatang);
				
	}

}
