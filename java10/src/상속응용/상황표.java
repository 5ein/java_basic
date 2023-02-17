package 상속응용;

public class 상황표 {

	public static void main(String[] args) {
		타이머 time = new 타이머();
		카운트 count = new 카운트();
		이미지 img = new 이미지();
		
		time.start();
		count.start();
		img.start();
	}

}
