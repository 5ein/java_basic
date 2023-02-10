package 조건문;

public class IF문SWICH문3 {

	public static void main(String[] args) {
		//String 조건문에 사용하기
					//0123456 번
		String ssn = "2055111"; //주민번호 뒷자리
		
		//String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함.
		if (ssn.equals("2055111") ) {
			System.out.println("동일한 지역에서 태어나셨군요!!");
		} else {
			System.out.println("동일한 지역에서 태어난게 아니시군요!!");
		}
		
		
		char gender = ssn.charAt(0); //첫번째 자리에 있는 문자 하나 추출
		switch (gender) {
		case '1': //char일떄는 '' 써주기
		case '3':
			System.out.println("남자");
			break;
		case '2': //char일떄는 '' 써주기
		case '4':
			System.out.println("여자");
			break;
		}
	}
}
