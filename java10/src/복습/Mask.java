//생성자

package 복습;

public class Mask {
	//멤버변수
	String color;
	int price;
	int count;
	
	//1. 클래스이름과 동일한 메서드를 만들어주면, new를 가지고 객체생성시 자동호출
	//source--> Generate Constructor using Fields.. 누르기!
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}
	
	//2. toString
	//source--> Generate toString() 누르기!
	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
}
