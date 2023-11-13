// 설계도
public class Book {
	// 제목, 저자
	String title;
	String author;
	static int count;
	
	public Book() {
		count++;
	}
	public Book(String title, String authour) {
		this.title = title;
		this.author = authour;
		count++;
	}
	
	public void show() {
		System.out.println(title + ", " + author);
	}
}
