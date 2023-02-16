package 스테틱;

public class Day {
	String doing;
	int time;
	String location;
	
	//누적이나 공유할 목적! ==> static변수로!!
	static int count; // ststic을 안하면 객체가 생성될때 마다 새로운 count가 생기게됨..
	static int sum; // 전체 시간 누적하는것 만들기

	public Day(String doing, int time, String location) {
		// new로 부품을 만드는 것: 객체생성
		// 객체생성할 때 마다 꼭 처리하고 싶은 내용이 있으면 생성자 메서드내에서 써주세요.
		// 객체생성할 때 생성자 메서드가 자동호출되기 때문에 무조건 처리해줌.
		count++;
		sum += time; // sum = sum + time 과 같음
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
