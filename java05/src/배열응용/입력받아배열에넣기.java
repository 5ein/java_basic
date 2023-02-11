package 배열응용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 입력받아배열에넣기 {
	public static void main(String[] args) {
		// 작년에 가고싶었던곳 세곳을 입력받아넣으세요. 제주도 양양 속초
		// 올해 가고싶었던 곳 세곳을 입력받아 넣으세요. 제주도 부산 울산
		// 위 입력은 우선순위에 따라 입력한것임.
		// 작년과 올해 가고싶은곳과 우선순위가 동일한 곳은 몇곳인가?
		// 같은위치에 있는 장소끼리만 비교해주세요.

//		스캐너 사용
		Scanner sc = new Scanner(System.in);
		
		String[] place1 = new String[3];
		String[] place2 = new String[3];

		System.out.print("작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요.>> ");
		for (int i = 0; i < place1.length; i++) {
			place1[i] = sc.next();
		}
		
		System.out.print("올해에 가고 싶었은 곳 세곳을 입력받아 넣으세요.>> ");
		for (int i = 0; i < place2.length; i++) {
			place2[i] = sc.next();
		}
		
		int samePlace = 0;
		for (int i = 0; i < place2.length; i++) {
			if (place1[i].equals(place2[i])) {
				samePlace++;
			}
		}
		System.out.println("작년과 올해 가고싶은 곳과 우선순위가 동일한 곳은 " + samePlace + "곳 입니다.");
		
		sc.close();
		
//		//JOptionPane사용
//		String[] last = new String[3];
//		String[] year = new String[3];
//		
//		for (int i = 0; i < year.length; i++) {
//			last[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳을 입력하시오.");
//			year[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳을 입력하시오.");
//		}
//		int count = 0;
//		
//		for (int i = 0; i < year.length; i++) {
//			if (last[i].equals(year[i])) {
//				count++;
//				System.out.println("같은 위치는 " + i);
//			}
//		}
//		System.out.println("같은 위치의 개수는 " + count);
		
	}
}
