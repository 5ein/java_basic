package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
		//scanner 사용!!
		Scanner sc = new Scanner(System.in);
		
		//1
//		id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
//		아니면 로그인 실패!
//		==> String은 ==비교 불가능. equals() 비교해야함.
		System.out.println("id입력>> ");
		String id = sc.next(); //string 입력
		System.out.println("pw입력>> ");
		String pw = sc.next(); //string입력
		
		//조건이 여러개인 경우 ==> 논리연산자 (조건1 && 조건2)
		if (id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		}else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
		
		
		//2
//		사과 구매 갯수, 사과 한 개당 가격입력
//		딸기 구매 갯수, 딸기 한 개당 가격입력
//		다음과 같이 출력
//		사과 구매 가격은 5500원입니다.
//		딸 구매 가격은 4500원입니다.
//		전체 구매 가격은 10000원입니다.
		System.out.print("사과 구매 갯수>> ");
		int aCount = sc.nextInt(); //String --> int
		System.out.print("사과 한 개당 가격입력>> ");
		int aPrice = sc.nextInt(); //String --> int
		System.out.print("딸기 구매 갯수>> ");
		int bCount = sc.nextInt(); //String --> int
		System.out.print("딸기 한 개당 가격입력>> ");
		int bPrice = sc.nextInt(); //String --> int
		
		int aTotal = aCount * aPrice;
		int bTotal = bCount * bPrice;
		int total = aTotal + bTotal;
		
		System.out.println("사과 구매 금액은 " + aTotal + "원");
		System.out.println("딸기 구매 금액은 " + bTotal + "원");
		System.out.println("전체 구매 금액은 " + total + "원");
		
		
		//3
//		심화문제
//		- 시작값, 종료값 입력
//		시작값부터 종료값까지 모두 더해서 출력
		System.out.println("시작값>> "); //1, 1000
		int start = sc.nextInt();
		System.out.println("종료값>> "); //10, 2000
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("최종 더한 값은 >> " + sum);
		
		
		//4 
//		심화문제
//		- 시작값, 종료값, 점프값 입력
//		시작값부터 종료값까지 점프값만큼 증가하면서 더함.
//		더한 값을 출력
//		더한 값이 100을 넘으면 프로그램 종료
		System.out.println("시작값>> "); //1, 1000
		int start1 = sc.nextInt();
		System.out.println("종료값>> "); //10, 2000
		int end1 = sc.nextInt();
		System.out.println("점프값>> "); //10, 2000
		int jump = sc.nextInt();
		
		int sum1 = 0;
		for (int i = start1; i <= end1; i = i + jump) {
			sum1 = sum1 + i;
			if (sum1 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 >> " + sum1);
		
		
		sc.close();
	}

}
