//생성자

package 복습;
 
public class Mask사용 {

	public static void main(String[] args) {
//		Mask mask1 = new Mask(); // 객체생성
//		mask1.color = "하얀색";
//		mask1.price = 1000;
//		mask1.count = 3;
		//1. 멤버변수값을 매번 준다.
		// ==> 객체 생성시 멤버변수값을 자동으로 무조건 넣어주는 처리를 하고싶다.
		Mask mask1 = new Mask("하얀색", 1000, 3); 
		
//		System.out.println(mask1.color);
//		System.out.println(mask1.price);
//		System.out.println(mask1.count);
		//2. 위처럼 여러개를 쓰는 것보다 아래처럼 한번만 찍어줄수는 없을까?
		// 근데 그냥 이렇게하면 주소값이 찍힘! --> toString 사용하기!
		System.out.println(mask1);
		
	}

}
