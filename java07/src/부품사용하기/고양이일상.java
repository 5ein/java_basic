package 부품사용하기;

import 부품만들기.고양이;

public class 고양이일상 {

	public static void main(String[] args) {
		
		고양이 보니 = new 고양이();
		보니.play = "레이저 잡기";
		보니.eat = "참치캔";
		보니.행동하다();
		System.out.println("보니의 놀이: " + 보니.play);
		System.out.println("보니의 식사: " + 보니.eat);
		
		System.out.println("====================");
		
		고양이 하니 = new 고양이();
		하니.play = "캣타워에 올라가기";
		하니.eat = "츄르";
		하니.쉬다();
		System.out.println("하니의 놀이: " + 하니.play);
		System.out.println("하니의 간식: " + 하니.eat);
		
	}

}
