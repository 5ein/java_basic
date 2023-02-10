package 배열응용;

public class 여러개배열사용하기2 {
	public static void main(String[] args) {
		String[] names = { "뉴진스", "르세라핌", "엔믹스", "에스파", "스테이씨" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 1학기성적보다 2학기 성적이 높은 학생 몇명??
		// 2. 1학기, 2학기 성적이 동일한 학생 몇명?
		int count2 = 0;
		int count12 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count12++;
			} else if (term1[i] < term2[i]) {
				count2++;
			}//if
		}//for
		System.out.println("1학기보다 2학기 성적이 높은 학생은 " + count2 + "명 입니다.");
		System.out.println("1학기와 2학기 성적이 동일한 학생은 " + count12 + "명 입니다.");
		
		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("만점 학생의 인덱스 번호는 " + i);
				System.out.println("만점 학생의 이름은 " + names[i]);
			}//if
		}//for
		
		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < term2.length; i++) {
			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];
		}//for
		double avg1 = (double)sum1 / term1.length;
		double avg2 = (double)sum2 / term2.length;
		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높았습니다.");
		} else if (avg1 < avg2) {
			System.out.println("2학기 평균이 더 높았습니다.");
		} else {
			System.out.println("1학기와 2학기 평균이 동일합니다.");
		}

		// 5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 위치는 " + i);
				System.out.println("뉴진스의 1학기 성적은 " + term1[i] + ", 2학기 성적은 " + term2[i]);
			}
		}
		
		
		

	}
}
