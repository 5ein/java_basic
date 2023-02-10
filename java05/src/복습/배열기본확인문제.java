package 복습;

public class 배열기본확인문제 {
	public static void main(String[] args) {
		
		String[] place = {"japan", "china", "USA", "france", "LA"};
		
		for (String k : place) {
			System.out.println(k);
		}
		
		char[] color = {'r', 'g', 'b', 'p', 'w'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(i);
		}
		
		double[] height = new double[9];
		height[0] = 176;
		height[1] = 181;
		height[2] = 184;
		height[3] = 182;
		height[4] = 174;
		height[5] = 174;
		height[6] = 173;
		height[7] = 174;
		height[8] = 177;
		for (int i = 0; i < height.length; i++) {
			System.out.println(i);
		}
		for (double k : height) {
			System.out.println(k);
		}
	}
	
}
