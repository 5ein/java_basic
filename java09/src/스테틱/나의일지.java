package 스테틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "기숙사"); // 변수 4개 (day1, "자바공부", 8, "기숙사")
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//객체 생성할 떄 마다 count, sum 누적
		
		Day day2 = new Day("주변산책", 1, "수영역근방"); // 변수 4개 (day2, "주변산책", 1, "수영역근방")
		System.out.println(Day.count);
		System.out.println(Day.sum);
		
		Day day3 = new Day("시험요약정리", 2, "기숙사");// 변수 4개 (day3, "시험요약정리", 2, "기숙사")
		System.out.println(Day.count);
		System.out.println(Day.sum);
		
		// 총 12개 다이나믹하게 변수 생성, 멤버변수 ==> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		// 인스턴스 변수라고 부른다.

		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}
