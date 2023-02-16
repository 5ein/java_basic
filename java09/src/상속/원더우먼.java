package 상속;

public class 원더우먼 extends 우먼{
	
	boolean longHair;
	
	public void earth() {
		sleep();
		System.out.println("이름은 " + name);
		System.out.println("구하러 가다.");
	}
	
	public void eat() {
		System.out.println("든든하게 먹다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [longHair=" + longHair + ", beautiful=" + beautiful + ", name=" + name + ", age=" + age + "]";
	}
	
}
