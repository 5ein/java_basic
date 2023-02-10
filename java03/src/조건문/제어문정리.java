package 조건문;

import java.util.Scanner;

public class 제어문정리 {

	public static void main(String[] args) {
		//scanner 사용!!
		
		Scanner sc = new Scanner(System.in);
		
		//1
//		id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
//		아니면 로그인 실패!
//		==> String은 ==비교 불가능. equals() 비교해야함.
		System.out.print("id를 입력해주세요. ");
		String id = sc.next();
		System.out.print("pw를 입력해주세요. ");
		String pw = sc.next();
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패!");
		}
		
		System.out.println("--------------------");
		
		//2
//		사과 구매 갯수, 사과 한 개당 가격입력
//		딸기 구매 갯수, 딸기 한 개당 가격입력
//		다음과 같이 출력
//		사과 구매 가격은 5500원입니다.
//		딸 구매 가격은 4500원입니다.
//		전체 구매 가격은 10000원입니다.
		System.out.print("사과 구매 갯수를 입력하시오.");
		int apple = sc.nextInt();
		System.out.print("사과 가격을 입력하시오.");
		int applePrice = sc.nextInt();
		int appleFull = apple * applePrice;
		System.out.print("딸기 구매 갯수를 입력하시오.");
		int berry = sc.nextInt();
		System.out.print("딸기 가격을 입력하시오.");
		int berryPrice = sc.nextInt();
		int berryFull = berry * berryPrice;
		int Full = appleFull + berryFull;
		System.out.println("사과 구매 가격은 " + appleFull + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + berryFull + "원 입니다.");
		System.out.println("전체 구매 가격은 " + Full + "원 입니다.");
		
		System.out.println("--------------------");
				
		//3
//		심화문제
//		- 시작값, 종료값 입력
//		시작값부터 종료값까지 모두 더해서 출력
		System.out.print("시작값을 입력하세요.: ");
		int first = sc.nextInt();
		System.out.print("종료값을 입력하세요.: ");
		int last = sc.nextInt();
		int sum = 0;
		for (int i = first; i <= last; i++) {
			sum = sum + i;
		}
		System.out.println("총 합은: " + sum);
		
		System.out.println("--------------------");
		
		//4 
//		심화문제
//		- 시작값, 종료값, 점프값 입력
//		시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
//		더한 값이 100을 넘으면 프로그램 종료
		System.out.print("시작 값: ");
		int start = sc.nextInt();
		System.out.println("끝 값: ");
		int end = sc.nextInt();
		System.out.println("증가값: ");
		int jump = sc.nextInt();
		int total = 0;
		for (int i = start; i < end; i = i + jump) {
			total = total + i;
			if (total > 100) {
//				System.out.println("더한 값이  " + total + "로 100을 넘어 프로그램이 종료됩니다.");
//				break;
				System.exit(0);
			}
			System.out.println("더한 값: " + total);
		}
		
		
		sc.close();
	}

}
