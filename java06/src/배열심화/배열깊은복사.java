package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = { 100, 200, 300 };
		int[] num4 = num3; // 얕은 복사, 주소가 복사
		int[] num5 = num3.clone(); // 깊은 복사, 주소가 가르키고 있는 값을 복사
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		// 주소기 같은지 비교
		System.out.println(num3 == num4);
		System.out.println(num3 == num5);

		// 얕은 복사, 주소가 복사
		num3[0] = 999;
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i] + " ");
		}

		// 깊은 복사, 주소가 가르키고 있는 값을 복사
		num3[1] = 999;
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num5.length; i++) {
			System.out.println(num5[i] + " ");
		}

	}

}
