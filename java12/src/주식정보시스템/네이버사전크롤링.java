package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버사전크롤링 {
//크롤링은 인터넷 문서(html)을 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 뭥하는 정보를 추출하는것.

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://dict.naver.com/");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list = doc.select(".Nnav_cell a"); //Nnav_cell클래스 밑에있는 a태그들 가져와라
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}