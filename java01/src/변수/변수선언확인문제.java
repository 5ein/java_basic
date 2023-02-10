package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 내 정보중 기본 데이터에 속하는 정보를 변숭 넣고, 출력해보세요.!
		
		//정수
		int age = 24;
		
		//실수
		double height = 160.8;
		
		//문자1
		char gender = '여';
		
		//논리
		boolean food = true;	//true / false	
		
		//int num; //같은 저장공간만 만드는 것은 되도록 삼가
		//int num = 0; //값을 모르겠으면 그냥 0 넣기!
		
		
		//String은 기본데이터X ==> 너무 많이 쓰기 때문에 기본형처럼 사용가능한 유일한 데이터!!!
		String name = "홍길동"; //여러글자를 쓸때는 String "", 한글자일때는 char''
		//스트링, 실!!
		
		//프린트해보세요.!!
		System.out.println("나의 이름은 : " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 키는 " + height);
		System.out.println("나의 성별은 " + gender);
		System.out.println("나는 아침을 먹었다.: " + food);

	}

}
