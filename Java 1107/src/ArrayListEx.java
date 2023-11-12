import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// 배열, 크기가 정해지지 않은 배열
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("복숭아");		// 0
		strList.add("망고");		// 1
		strList.add("포도");		// 2
		strList.add("배");		// 3
		strList.add("귤");
		
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		System.out.println(strList.get(3));
		System.out.println("-----------------");
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("-----------------");
		
		// int타입 ArrayList 생성
		ArrayList<Integer> intList = new ArrayList<Integer>();		// int는 객체가 아니라 못 들어감 Integer로 해야 가능
		intList.add(42);	// 데이터 입력
		intList.add(39);
		intList.add(17);
		intList.add(5);
		intList.add(52);
		intList.add(9);
		
		for(int i=0; i<intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("레 미제라블", "빅토르 위고"));
		Book book2 = new Book("어린 왕자", "생떽쥐베리");
		bookList.add(book2);
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i).title + "," + bookList.get(i).author);
			bookList.get(i).show();
		}
		System.out.println();
		
		// 11/09
		ArrayList<Double> dbList = new ArrayList<Double>();
		dbList.add(3.14);
		dbList.add(0.12);	// 1->2
		dbList.add(1.23);	// 2->3
		dbList.add(1, 0.11); 	// 1 (넣고 싶은 배열방에 데이터 넣기)
		// forEach문
		for(Double item : dbList) {
			System.out.println(item);
		}
		
		
	}

}
