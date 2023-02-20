package 형변환;

import java.util.HashSet;

public class 로또문제 {

	public static void main(String[] args) {
		HashSet bag = new HashSet(); //set은 순서가 없이 막넣음
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		System.out.println(bag); //set은 순서가 없이 막들어가있음
		
		bag.add("볼펜"); //중복제거!!
		System.out.println(bag); //중복된것 넣으면 자동으로 제거해줌 (중복없이 무조건 1개만 넣어줌)
	}

}
