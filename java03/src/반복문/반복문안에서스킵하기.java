package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// ! ==> not의 뜻
		
		// i가 8이 되면 종료!!
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트!!
		for (int i = 1; i <= 10; i++) {
			if (i == 8) { 
				//break; //for문 졸료, for문 아래에 있는 내용이 이어서 실행!!
				System.exit(0); //이 프로그램이 아얘 나가짐 
				// 0:정상종료, 0이 아닌 다른 값:비정상종료(강제종료)
			}
			if (i % 2 != 0) { // 홀수 나머지가 0이 아닐 때!!
				continue; // 이번 i만 for문 안의 내용을 실행하지말고 이어가라
			}
			System.out.println(i);
		}
		System.out.println("휴~~for문 다 끝났다.@@@");

	}

}
