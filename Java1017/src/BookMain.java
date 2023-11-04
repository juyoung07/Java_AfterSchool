
public class BookMain {

	public static void main(String[] args) {
		Book bk1 = new Book("어린왕자", "생떽쥐베리");
		System.out.println(bk1.title + " " + bk1.author);
		
		Book bk2 = new Book("춘향뎐");
		System.out.println(bk2.title + " " + bk2.author);
		
		Book bk3 = new Book();
		bk3.title = "자바";
		bk3.author = "를 잡아";
		System.out.println(bk3.title + "~" + bk3.author);
	}

}
