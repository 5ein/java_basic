package 복습;

class 배열만들기 {

	public static void main(String[] args) {
		//위에꺼 깜빡하고 안들고 오면 main + 컨트롤 + 스페이스바 하면됨
		
		//1. 배열 만들기 - 이미 값을 알고 있는 경우
		String[] hobby = {"run", "book", "swim", "walk"};//length --> 4
		// hobby : 참조형 변수, 주소가 들어있음.
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]); //첫번째 인덱스
		System.out.println("1: " + hobby[1]); //두번째 인덱스
		System.out.println(hobby.length); //.-->접근연산자
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		//C타입의 for문
		for (int i = 0; i < hobby.length; i++) {
			//i ==> index의 역할 , 0, 1, 2, ..
			System.out.println(i + ": " + hobby[i]);
		}
		
		//(최근 트렌드) 
		//for-each문: 알아서 처음부터 인덱스를 하나씩 증가하면서 하나씩 꺼내온다.
		//출력용!!
		//x <--"run", "book", "swim", "walk"
		for (String x : hobby) {
			System.out.println(x);
		}
		
		//2. 배열 만들기 - 값을 모르고 있는 경우, 공간부터 만들어두자.
		String[] jobs = new String[5];
		System.out.println(jobs); 
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페 주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		//System.out.println(jobs[5]); //없음.. 0~4까지임
		System.out.println(jobs[4]);
		System.out.println(jobs[jobs.length - 1]);
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i + ": " + jobs[i]);
		}
		for (String x : jobs) {
			System.out.println(x);
		}

	}

}
