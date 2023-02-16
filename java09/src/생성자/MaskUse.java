package 생성자;

public class MaskUse {

	public static void main(String[] args) {
		Mask m1 = new Mask("white", 5000, 50);
		Mask m2 = new Mask("black", 10000, 100);
		
		System.out.println(m1);
		System.out.println(m2);
	}

}
