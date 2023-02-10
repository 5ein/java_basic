package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리적으로 판단하고 싶을 때  
		
		int id = 1111; // =: 변수에 값을 넣을 때 사용!!
		int id2 = 2222;

		int pw = 3333;
		int pw2 = 3333;
		
		//아이디가 동일한지 비교! //비교할때 사용
		//패스워드가 동일한지 비교!
		System.out.println(id == id2); //false
		System.out.println(pw == pw2); //true
		// &&, and조건, 두조건이 모두 맞아야 맞다라고 판단
		//ex)로그인처리!!
		System.out.println(id == id2 && pw == pw2);
		
		int mem1 = 111; //= :  대입 연산자, 할당연산자
		int mem2 = 223;
		// ||, or조건, 조건 중에서 하나만 맞으면 맞다라고 판단
		System.out.println(mem1 == 111 || mem2 == 222);
	}

}
