package 상속응용;

public class 이미지 extends Thread {
	@Override
	public void run() {
		String[] image = { "one.png", "two.png", "three.jpg", "four.jpg", "five.png" };
		for (int i = 0; i < image.length; i++) {
			System.out.println("이미지: " + image[i]);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("cpu에 문제가 생겼습니다.");
			}
		}

	}
}
