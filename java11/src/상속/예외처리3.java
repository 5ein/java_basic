package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		// 아래의 코드를 분석해보고, 문제가 생길 여지가 있는 코드가
		// 에러가 발생했을때 실행을 제외 시켜버리고
		// 프로그램이 중간되지 않도록 해보세요.!!
		// 아래의 배열의 개수가 실행되게 해주세요.!
		int[] num = new int[3];
		try {
			// 문제가 생길 여지가 있는 코드!
			num[3] = 2; // 실행X, 실행 예외!
		} catch (Exception e) {
			// 문제가 생겼을 때 어떻게 처리할지를 써주어야함.
			// 문제가 생기지 않으면 여기가 실행되지 않기때문에 무조건 실행할 애는 여기 넣으면 안됨.
			System.out.println("배열에 문제가 있음.");
			e.printStackTrace();
		}
		System.out.println(num.length);// 배열의 개수
	}

}
