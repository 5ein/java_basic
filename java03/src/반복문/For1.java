package 반복문;

public class For1 {

	public static void main(String[] args) {
		// i를 왜 계속 쓸수 있나요 중복 안되나요?
		// for 지역{} 안에서만 i변수를 쓸수있음. 끝나면 사라짐.
		// 지역변수(local)라고 부름
		
		//for(초기값; 조건식; 증감식){}
		
		// 3번반복
		for (int i = 0; i < 3; i++) {
			//i = 0, i<3(true), 처리, i++
			System.out.println(i + "내가 반복1");			
		}
		
		//100번 반복 --> 내가 반복2 >> 0
		for (int i = 0; i < 100; i++) { //0~99
			System.out.println("내가 반복2 >> " + (i + 1));
		}
		
		//10번 반복 --> 내가 반복3 >> 1번째 실행중
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복3 >> " + (i + 1));
		}

	}

}
