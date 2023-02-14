package 배열복습;

public class 스트링과배열2 {

	public static void main(String[] args) {
		String s = "감자, 고구마, 양파";
		// 스트링에 들어있는 문자열을 분리시키고 싶을 때 split(기준), 기준==구분자
		// 분리된 결과는 배열에 들어감
		String[] s2 = s.split(","); // ,단위로 끊어서 배열에 넣음
		System.out.println(s2.length); //s2의 길이 출력
		System.out.println(s2[0]); //s2의 첫번째 문자열 출력
		String ss = "감자 고구마 양파";
		String[] s22 = ss.split(" "); // (공백) 단위로 끊어서 배열에 넣음
		System.out.println(s22[2]); // s22의 세번째 문자열 출력
		
		String s3 = "    홍길동"; // 공백4개
		System.out.println(s3.trim()); //공백 제거
		String s4 = s3.trim();
		System.out.println(s4.length()); //글자수를 학인.
		
		String s5 = s3.replace("    ", ""); //공백4개를 없앰으로 바꾸는것
		System.out.println(s5.length());
		
		String s6 = "홍길동"; //각각의 글자 하나하나 분리하고 싶을 때!
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
		
		
		
	}

}
