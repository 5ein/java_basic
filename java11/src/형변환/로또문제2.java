package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size()); // 아무것도 안넣어서 0임
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000)); // 1000보다 작은수들로 랜덤으로 나옴
		}
		System.out.println(lotto.size()); // 중복된것 빼고 나머지 갯수
		System.out.println(1000 - lotto.size()); // 중복된것의 갯수
		System.out.println(lotto);
	}

}
