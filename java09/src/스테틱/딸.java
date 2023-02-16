package 스테틱;

public class 딸 {
	String name;
	char gender;
	
	static int count;
	static int money = 10000;
	
	public 딸(String name, char gender) {
		count++;
		money = money - 1000;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
}
