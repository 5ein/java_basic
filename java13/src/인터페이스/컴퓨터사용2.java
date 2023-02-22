package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
		//익명클래스!!
		//인터페이스는 불완전 하기 때문에 이것을 틀로해서 객체생성 불가능!! (new불가능..)
		//computer인터페이스를 구체적으로 구현한 이름없는 클래스를 가지고 객체생성함. ==>익명클래스
		//안드로이드 앱만들때 선호하는 방법
		Computer com = new Computer() { 
			//Computer com = new Co 까지 치고 컨트롤 + 스페이스 해서 자동완성 누르기
			
			@Override
			public void 코딩하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 인터넷하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 유튜브하다() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}

}
