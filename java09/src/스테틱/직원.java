package 스테틱;

public class 직원 {
	String name; //인스턴스 변수
	int age;
	char gender;

	static int count; // 스태틱변수
	static double sum;
	// static변수는 하나의 변수를 만들어 값을 공유할 목적으로 만든다.
	// static메서드는 객체를 생성 하지 않고, 바로 특정한 긴으을 자주 사용할 목적으로 만든다.

	// 객체 생성하지 않고 클래스 이름으로 바로 접근해서 아무때나 원할 때 평균을 구하고 싶은 경우?
	// static 메서드로 만들어주세요.!
	public static void getAvg() {
		//static메서드에서 전역변수를 접근할 때는 같은 성격을 가진 static변수만 접근이 가능!!
		//System.out.println(name); // static변수가 아닌 name는접근불가..
		
		System.out.println(sum / count);
	}

	public 직원(String name, int age, char gender) {
		count++;
		sum += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
