package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수
		int count2 = 4; // 오후에 온 손님 수

		// 계산기3을 이용해주세요.
		// 1. 전체 손님 수를 반환 받아서 다음과 같이 프린트: 오늘 온 손님의 총 합은 9명 입니다.
		// 2. 오전과 오후 손님수 차이는? 프린트: 손님 수 차이는 1명 입니다.
		// 3. 오전에 들어온 손님의 결제 금액은? 프린트: 오전 결제금액은 35000원 입니다.
		// 4. 오후에 들어온 손님의 결제 금액은? 프린트: 오후 결제금액은 28000원 입니다.
		// 5. 오전과 오후에 들어온 손님의 총 결제금액은 ? 프린트: 오늘 하루 총 결제금액은 63000원 입니다.
		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산해주세요. 프린트: 1인당 결제금액은 7000원 입니다.

		// 1. 전체 손님 수를 반환 받아서 다음과 같이 프린트: 오늘 온 손님의 총 합은 9명 입니다.
		int countAdd = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + countAdd + "명 입니다.");

		// 2. 오전과 오후 손님수 차이는? 프린트: 손님 수 차이는 1명 입니다.
		int countMinus = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + countMinus + "명 입니다.");
		// System.out.println("손님 수 차이는 " + Math.abs(countMinus) + "명 입니다.");
//		Math.abs(뭐시기) 이거 절댓값 하는거래!!
//		System.out.println(Math.PI); //파이 3.14
//		System.out.println(Math.ceil(3.334)); //올림
//		System.out.println(Math.floor(3.334)); //내림
//		System.out.println(Math.round(3.334)); //반올림
//		System.out.println(Math.sqrt(100)); //루트
//		System.out.println(Math.max(100, 200)); //둥중 뭐가 크니? (두개만 가능)
//		System.out.println(Math.min(100, 200)); //둥중 뭐가 작니? (두개만 가능)
//		System.out.println(Math.pow(2, 3)); //2의 3승

		// 3. 오전에 들어온 손님의 결제 금액은? 프린트: 오전 결제금액은 35000원 입니다.
		int price1 = cal3.nul(price, count1);
		System.out.println("오전 결제금액은 " + price1 + "원 입니다.");

		// 4. 오후에 들어온 손님의 결제 금액은? 프린트: 오후 결제금액은 28000원 입니다.
		int price2 = cal3.nul(price, count2);
		System.out.println("오후 결제금액은 " + price2 + "원 입니다.");

		// 5. 오전과 오후에 들어온 손님의 총 결제금액은 ? 프린트: 오늘 하루 총 결제금액은 63000원 입니다.
		int priceAdd = cal3.add(price1, price2);
		System.out.println("오늘 하루 총 결제금액은 " + priceAdd + "원 입니다.");

		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산. 프린트: 1인당 결제금액은 7000원 입니다.
		int priceDiv = cal3.div(priceAdd, countAdd);
		System.out.println("1인당 결제금액은 " + priceDiv + "원 입니다.");
	}

}
