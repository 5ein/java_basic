package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		// 가짜 랜덤한 값을 만들어주는 부품.
		Random r = new Random(); //씨앗값,seed값, 안에 숫자를 넣으면 고정된 램덤중 하나가 나온다. 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + r.nextInt(10)); //0 부터 10 전까지 값 중 랜덤으로
		}

	}

}
