package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {
	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류를 콜랙션(collection)
		// ==> 종류가 많다.
		// ==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라 콜렉션의 종류가 많음.
		// ==> 배열 + 사이즈 조절 + 타입 아무거나 넣을수 있는 ArrayList
		ArrayList list = new ArrayList(); // 참조형 변수
		list.add("홍길동"); // 넣을때는 add 사용
		list.add(100);
		list.add(11.2);
		list.add(true);
		// 타입 상관 없고, 내가 넣고싶은 만큼 넣을수 있음.

		// 주소가 안나오고 값들이 나온다. == toString 재정의 되어있음
		System.out.println(list);
		System.out.println(list.get(0)); // 꺼내올때는 get
		System.out.println(list.get(1)); // 꺼내올때는 get
		System.out.println(list.get(2)); // 꺼내올때는 get
		System.out.println(list.get(3)); // 꺼내올때는 get

		// 중간에 삽입 가능
		list.add(0, "김길동");
		System.out.println(list);

		// 제거
		list.remove(0); // remove는 파괴함수(O)
		// 파괴함수: 원본을 파괴시켜버리는 함수(원본이 변형, ram에 있는 데이터 변경)
		// 비파괴한수: 원본은 파괴되지 않는 함수(ram에 있는 데이터 불변)
		System.out.println(list);
		
		//변경
		list.set(0, "정길동"); // 파괴함수(O)
		System.out.println(list);
		
		//index 위치확인
		int index = list.indexOf(true); //true 어디에 있어?
		System.out.println(index);
		
		//포함여부 확인
		boolean result = list.contains(11.2); //11.2 있니없니?
		System.out.println(result);
	}
}
