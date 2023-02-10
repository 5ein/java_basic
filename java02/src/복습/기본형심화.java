package 복습;

public class 기본형심화 {

	public static void main(String[] args) {
		// 기본형 4가지
		// 정수, 실수, 문자, 논리
		// int double char boolean
		
		// 온도
		double temp = 1.2; //자바는 세미콜론으로 항상 마무리!(끝의 의미);
		
		int floor = 2;
		
		char color = 'b';
		
		boolean eat = true;
		
		String location = "수영역";  //스트링의 S는 무조건 대문자!
		
		// syso + 컨트롤 + 스페이스바 (윈도우)
		// 망치처럼 자주 사용하는 부품은 대문자로 바로씁니다.!!
		// System -컴퓨터, out(출력장치) - 모니터
		//				  in(입력장치) - 키보드
		System.out.println("오늘 온도는 " + temp + "도");
		System.out.println("나는 "+floor+"층에 있어!");
		System.out.println("내가 입고있는 옷의 색은: "+color);
		System.out.println("나는 오늘 아침을 먹었다: "+ eat);
		System.out.println("나와 가장 가까운 지하철 역은 "+location+"입니다.");
	}

}
