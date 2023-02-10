package 베열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		
//		1. int크기 5인 배열을 생성해보세요.
		int[] h = new int[5];
		//전체 만들어지는 변수의 개수는  7개
		//총 변수 = h부분(주소 들어가는 부분), h[0], h[1], h[2], h[3], h[4], h.lenth
		
//		2. 배열의 크기를 프린트해보세요.
		//(배열의 크기 == 배열의 길이 == 배열의 사이즈)
		System.out.println("배열의 크기: " + h.length);
		
//		3. 배열의 첫번째 위치에 100을 넣어서, 프린트
		h[0] = 100;
		System.out.println("배열의 첫번째 값: " + h[0]);
		
//		4. 배열의 마지막 위치에 500을 넣어서, 프린트
		h[4] = 500;
		System.out.println("배열의 마지막 값: " + h[4]);
		
//		5. 배열위 3번째 위치에 200을 넣어서, 프린트
		h[2] = 200;
		System.out.println("배열의 세번째 값: " + h[2]);
		
//		6. 배열의 전체 데이터를 프린트
		System.out.print("배열의 전체 데이터: ");
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + " ");
		}
		System.out.println();
		
//		7. 배열의 전체 데이터를 인덱스와 함께 프린트
		System.out.print("배열의 전체 데이터: ");
		for (int i = 0; i < h.length; i++) {
			System.out.println(i + "번째 데이터: " + h[i]);
		}

	}

}
