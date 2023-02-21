package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000);  	//Object <-업캐스팅-Integer <-오토박싱-int
		list.add(189.1); 	//Object <- Double <- double
		list.add(false); 	//Object <- Boolean <- boolean
 		list.add('남'); 	//Object <- Character <- char
 		
 		//ArrayList는 toString()가 재정의
 		//list라는 참조형이기 때문에 list를 프린트하면 주소가 프린트됨!
 		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
 		//list를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		//1.전체 목록을 프린트 
		System.out.println(list);
		
		//2. 돈 1000을 꺼내서 2000을 더해 프린트
		int money = (int)list.get(0); 		//int <-오토언박싱-Integer <-다운캐스팅-Object
		System.out.println(money + 2000);
		
		//3. 키 189.1을 꺼내서 10을 더해 프린트 
		double height = (double)list.get(1); 	//double <- Double <- Object
		System.out.println(height + 10);
		
		//4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요.
		boolean food = (boolean)list.get(2); 		//boolean <- Boolean <- Object
		if (food) { //if(조건) : 조건이 true 이면 이라는 뜻!
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요.");
		}
		
		//5. 성별 남 꺼내서 남 이면 주민번호는 1,3 이예요, 아니면 주민번호는 2,4 예요.
		char gender = (char)list.get(3); 			//char <- Character <- Object
		if (gender == '남') { //char는 기본형이기 때문에 저렇게 가능, string은 equls를 써줘야함
			System.out.println("주민번호는 1,3 이예요.");
		} else {
			System.out.println("주민번호는 2,4 이예요.");
		}
		
	}

}
