package 배열심화;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class 배열2차원 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 300);

//		String header[] = {"수학", "국어", "한국사"};
//		String contents[][] = { {"1", "2", "3"}, {"2", "1", "3"}, {"3", "2", "1"}};
//		
//		JTable table = new JTable(contents, header);
//		JScrollPane scroll = new JScrollPane(table);
//		f.add(scroll);

		String[] header = { "아침", "점심", "저녁" };
		String[][] menu = { { "유부초밥", "마라탕", "짜장면" }, { "샌드위치", "냉면", "김밥" }, { "볶음밥", "김치찌개", "라멘" },
				{ "된장찌개", "족발", "양념갈비" }, { "햄버거", "대패삼겹살", "치킨" }, { "감자탕", "닭도리탕", "피자" } };

		JTable eat = new JTable(menu, header);
		
		JTableHeader header1 = eat.getTableHeader();
		header1.setBackground(Color.gray);
		header1.setForeground(Color.white);
		
		eat.setBackground(Color.lightGray);
		eat.setForeground(Color.white);

		JScrollPane scroll = new JScrollPane(eat);

		f.add(scroll);

		f.setVisible(true);
	}

}
