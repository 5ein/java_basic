package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//강사님과 함께 한것에 주소만 바꾼거!

public class 에스엠증권크롤링 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=041510");

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); // html코드를 다 가지고온다.!
//			Elements codeList = doc.select(".code");
//			System.out.println(codeList.size());
//			Element tag = codeList.get(0);
//			String code = tag.text();
//			System.out.println("코드는 " + code);

			// <span class="blind">
			Elements list = doc.select("span.blind"); // span 중에서 blind
//			System.out.println(list.size());
//			System.out.println(list);

			// 인덱스 몇번인지 확인하기
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(i + ": " + list.get(i));
//			}

			// 현재가
//			System.out.println();
//			System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);

			// 최저가
//			System.out.println(list.get(20));
			Element tag3 = list.get(20);
			String low = tag3.text();
			System.out.println("최저가 " + low);

			// 최대가
//			System.out.println(list.get(16));링크만 바꾸면 나오는건가요?
			Element tag4 = list.get(16);
			String high = tag4.text();
			System.out.println("최대가 " + high);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}