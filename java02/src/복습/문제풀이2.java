package 복습;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {

		// 1.암호를 대시오 입력 ==>pass라고 입력
		// 암호가 맞으면 "들어오세요."프린트
		// 암호가 틀리면 "나가세요."프린트
		// equals() 사용하세요.
		String ps = JOptionPane.showInputDialog("암호를 대시오.");
		if (ps.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}

		// 2.당신이 먹고 싶은 저녁 메뉴는(자장면, 라면, 회)에서 선택
		// 자장면이면"중국집으로 가요." 프린트
		// 라면이면"분식집으로 가요." 프린트
		// 회이면"횟집으로 가요." 프린트
		// 위에 없으면 "그냥 안먹어요." 프린트
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?(자장면, 라면, 회 중에서 선택)");
		// if문
		// equals() 사용하세요.
//		if (food.equals("자장면")) {
//			System.out.println("중국집으로 가요.");
//		} else if (food.equals("라면")) {
//			System.out.println("분식집으로 가요.");
//		} else if (food.equals("회")) {
//			System.out.println("횟집으로 가요.");
//		} else {
//			System.out.println("그냥 안먹어요.");
//		}
		// switch문
		switch (food) {
		case "자장면":
			System.out.println("중국집으로 가요.");
			break;
		case "라면":
			System.out.println("분식집으로 가요.");
			break;
		case "회":
			System.out.println("횟집으로 가요.");
			break;
		default:
			System.out.println("그냥 안먹어요.");
			break;
		}

		// 3.JOptionPane을 사용
		// 두 정수를 입력받으세요. --> 누가 더 큰지 출력!
		String num1 = JOptionPane.showInputDialog("정수 num1을 입력하세요.");
		String num2 = JOptionPane.showInputDialog("정수 num2을 입력하세요.");

		// 정수로 변환 Integer.parseInt();
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);

		if (num11 > num22) {
			System.out.println("첫번째 값이 크다.");
		} else if (num11 < num22) {
			System.out.println("두번째 값이 크다.");
		} else {
			System.out.println("값이 같다.");
		}

		// 4.사원번호 ==> String no = "A100EX";
		// 맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
		// A이면 기획부 프린트, B이면 총무부 프린트,
		// C이면 개발부 프린트, 아니면 해당부서없음 프린트
		String no = "A100EX";

		char ch = no.charAt(0);
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서 없음");
			break;
		}

		// 추가1. 두 수와 사칙연산자를 입력받아
		// 두 수를 사칙연산자에 따라 처리후 출력
		String n1 = JOptionPane.showInputDialog("첫번째 수를 입력해주세요");
		String n2 = JOptionPane.showInputDialog("두번째 수를 입력해주세요");
		String op = JOptionPane.showInputDialog("사칙 연산자를 입력하세요(+, -, *, /, %");

		double n11 = Double.parseDouble(n1);
		double n22 = Double.parseDouble(n2);

		double result = 0;
		switch (op) {
		case "+":
			result = n11 + n22;
			System.out.println(result);
			break;
		case "-":
			result = n11 - n22;
			System.out.println(result);
			break;
		case "*":
		case "x":
		case "X":
			result = n11 * n22;
			System.out.println(result);
			break;
		case "/":
			result = n11 / n22;
			System.out.println(result);
			break;
		case "%":
			result = n11 % n22;
			System.out.println(result);
			break;
		default:
			System.out.println("처음부터 다시 입력해주세요");
			break;
		}

		// 추가2. 두 수를 입력받아 정수로 변환하여 정수변수에 저장,
		// 나누기 연산 수행후 소숫점 2째자리까지 출력
		String a = JOptionPane.showInputDialog("첫 번째 수를 입력해주세요.");
		String b = JOptionPane.showInputDialog("두 번째 수를 입력해주세요.");

		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		double result1 = (double) a1 / b1;
		
		//%.nf는 소숫점 n번째자리 까지 출력한다는 뜻(printf를 사용해야함)
		System.out.printf("%.2f", result1);

	}
}
