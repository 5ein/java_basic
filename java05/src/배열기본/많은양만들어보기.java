package 배열기본;

//Random의 위치는 java폴더아래 util아래 있어요.
import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		
		int[] jumsu =  new int[999];
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("=============================");

		//Random을 이용
		Random r = new Random();
		//int data = r.nextInt(4);//0~3까지 나옴
		//int data = r.nextInt(4)+1;//1~4까지 나옴
		//System.out.println(data);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(4) + 1;
		}
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
	}

}
