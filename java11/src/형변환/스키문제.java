package 형변환;

import java.util.ArrayList;
import java.util.HashSet;

public class 스키문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		System.out.println(list);
		
		list.remove(1); // == list.remove("송스키");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) { //arraylist는 .size 사용
			System.out.println((i + 1) + "등:" + list.get(i));
		}
		
		System.out.println(list.contains("김연아")); //김연아가 포함되어 있는가?
		
		System.out.println(list.size()); //길이가 얼마?
		
		ArrayList list2 = new ArrayList();
		list2.add("이스키");
		list2.add("박스키");
		list2.add("양스키");
		list.addAll(list2); //list2를 list에다 붙여라 
		//list는 바뀜 == 파괴형 함수, list2는 그대로 있음
		System.out.println(list);
		
		System.out.println(list2.isEmpty()); //리스트가 비었니?
		list2.clear(); //list2 내용 전체 삭제!!
		System.out.println(list2);
	}

}
