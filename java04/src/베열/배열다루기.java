package 베열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10]; // length: 10
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;

		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);

		System.out.println();

//		1. 우리가족의 성별을 char로 저장, 프린트
		char[] family = { '남', '여', '여', '여', '남' };
		for (int i = 0; i < family.length; i++) {
			System.out.print(family[i] + " ");
		}

//		2.우리가족의 이름을 String[]으로 저장, 프린트
		String[] fname = { "아빠", "엄마", "나", "여동생", "남동생" };
		for (int i = 0; i < fname.length; i++) {
			System.out.print(fname[i] + " ");
		}

//		3.우리가족의 시력을 double[]로 저장, 프린트
		double[] feys = { 0.8, 1.0, 1.5, 0.5, 0.9 };
		for (int i = 0; i < feys.length; i++) {
			System.out.print(feys[i] + " ");
		}

//		4.우리 가족이 점심을 먹었는지 boolean[]로 저장, 프린트
		boolean[] flunch = { true, true, true, true, true };
		for (int i = 0; i < flunch.length; i++) {
			System.out.print(flunch[i] + " ");
		}

	}

}
