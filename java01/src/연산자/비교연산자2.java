package 연산자;

public class 비교연산자2 {

	public static void main(String[] args) {
		// 기본형은 연산자(기호)를 이용해서 비교가능??
		// 기본형 데이터는 비교연산자를 가지고 비교 가능
		// 기본형 데이터가 아니면 비교연산자를 가지고 비교 불가능
		int id = 1111; // =: 변수에 값을 넣을 때 사용!!
		int id2 = 2222;

		int pw = 3333;
		int pw2 = 3333;

		// 아이디가 동일한지 비교
		// 패스워드가 동일한지 비교
		System.out.println("아이디가 동일한가요? " + (id == id2));
		System.out.println("패스워드가 동일한가요? " + (pw == pw2));

		// 컨트롤 + 알트 + 화살표 아래 (한줄복사)
		// 가로를 넣어 최우선순위를 가지게 함!
	}

}
