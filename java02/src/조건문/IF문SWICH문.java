package 조건문;

public class IF문SWICH문 {

	public static void main(String[] args) {
		//조건이 여러개 일떄
		int myNum = 99;
		//if~else if~else
		//점수가 80점 이상이면 최우수 프린트
		//점수가 70점 이상이면 우수 프린트
		//점수가 60점 이상이면 보통 프린트
		//나머지는 미달
		//if~~문은 조건이 맞아서 실행하고 나서 자동으로 끝남.!!
		//break안써줌.
		
		if (myNum >= 80) {
			System.out.println("최우수");
		}else if (myNum >= 70) {
			System.out.println("우수");
		}else if (myNum >= 60) {
			System.out.println("보통");
		}else {
			System.out.println("미달");
		}
		
		//switch
		int myTour = 10; //올해 여행 횟수
		//여행횟수가 10이면 "VVIP"프린트
		//여행횟수가 6이면 "VIP"프린트
		//나머지 횟수이면 "Normal"프린트
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break; //switch문은 수동으로 break 써주어야함.
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Nomal");
			break; //어짜피 마지막이어서 break안써줘도 된대
		}

	}

}
