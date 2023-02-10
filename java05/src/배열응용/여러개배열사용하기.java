package 배열응용;

public class 여러개배열사용하기 {

	public static void main(String[] args) {
		// 여러개의 배열을 사용하고 싶은 경우
		// 같은 인덱스를 쓰세요.
		// ex)아버지에 대한 정보는 모든 배열에서 0번에 넣자.
		String[] 식구 = { "아버지", "어머니", "나", "여동생", "남동생" };
		int[] age = { 53, 54, 24, 22, 14 };
		double[] height = { 175.5, 164.5, 161.1, 165, 183.3 };
		// 컨트롤 + 쉬프트 + f : 코드 자동 정렬
		
		// \t는 띄어쓰기!!
		System.out.println("이름\t나이\t키");
		System.out.println("---------------------");
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		}

	}

}
