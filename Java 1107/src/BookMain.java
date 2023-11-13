
public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("레 미제라블", "빅토르 위고");
		Book book2 = new Book("어린 왕자", "생텍쥐베리");
		Book book3 = new Book("자바프로그래밍", "강은영");
		Book book4 = new Book();
		book4.title = "체육";
		book4.author = "볶음";
		
		book1.show();
		book2.show();
		book3.show();
		book4.show();
		
		System.out.println("총 " + Book.count + "권");
		
	}

}
