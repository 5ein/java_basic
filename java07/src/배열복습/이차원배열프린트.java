package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		String[][] s = {
				{"다이어트 성공하기", "원하는 곳 취업하기", "살 빼기"},
				{"우리 가족 싸우지 말기", "돈 많이벌기", "많은 곳 여행하기"},
				{"우리 가족 모두 건강하기", "옷 잘입기", "맛있는거 먹기"}
		}; //전체를 프린트 하기
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.print(s[i][j] + ", ");
			}
			System.out.println();
		}
		
	}

}
