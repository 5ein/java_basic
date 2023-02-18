package 상속응용;

public class 달러골뱅이앤드스레드사용 {

	public static void main(String[] args) {
		골뱅이스레드 골뱅이 = new 골뱅이스레드();
		앤드스레드 앤드 = new 앤드스레드();
		달러스레드 원 = new 달러스레드();
		
		골뱅이.start();
		앤드.start();
		원.start();
	}

}
