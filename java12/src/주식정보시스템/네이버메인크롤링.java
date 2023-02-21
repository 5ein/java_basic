package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1. 네트워크 연결 성공. " + con);
		
		Document doc = null; //로컬변수(지역변수)는 초기화를 해주어야함 (수동으로!)
		try {
			doc = con.get(); //외부에서 가져오기때문에 예외처리필수!
			Elements list = doc.select(".nav"); //<a class="nav"> 가져오기 (클래스는 .붙이기)
			//클래스가 nav인 태그를 다 가지고 와서 ArrayList를 상속받은 Elements에 자동으로 넣어중다.
			//Elements ==> [Element, Element, Element(tag)]
			
			System.out.println(list.size()); //몇개 가져오는지 확인
			//System.out.println(list); //리스트 가져오기
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); //Element 임!!얜 s없음!!
				//System.out.println(tag1); //<a class="nav">메일</a> 얘내 full 가져옴
				String text1 = tag1.text(); //<a class="nav">메일</a> ==> 태그 사이의 텍스트 추출
				System.out.println(text1);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		//System.out.println(doc); //전체 doc코드 프린트
		
	}

}
