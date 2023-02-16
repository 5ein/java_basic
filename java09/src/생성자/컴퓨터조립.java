package 생성자;

//	컴퓨터.java와 컴퓨터조립.java를 완성해보세요.!
//	==> 파라메터있는 생성자가 필요!
//	==> toString()있으면 편하게 멤버변수의 값을 출력해서 확인할 수 있음.

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 내꺼 = new 컴퓨터(2000, "CHERRY", 20);
		컴퓨터 친구꺼 = new 컴퓨터(3000, "PEACH", 20);

		System.out.println(내꺼);
		System.out.println(친구꺼);
	}

}
