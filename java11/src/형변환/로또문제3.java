package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; lotto.size() < 6; i++) { //i < 6 으로 하면 중복된값이 빼고 5개 등등이 나올수가 있기때문에
			lotto.add(r.nextInt(45) + 1); //((0~44) + 1) ===>  1~45
		}
		System.out.println(lotto.size()); // 중복된것 빼고 나머지 갯수
		System.out.println(lotto);
	}

}
