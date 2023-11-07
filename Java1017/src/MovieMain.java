
public class MovieMain {

	public static void main(String[] args) {
		Movie m1 = new Movie("리틀포레스트", 9.01, "안순례", 2018);
//		System.out.println(M1.title + " " + M1.score + " " + M1.director + " " + M1.year);
		m1.print();
		
		Movie m2 = new Movie("너의 췌장을 먹고싶어", 8.49, "우시지마 신이치로", 2018);
		m2.print();

	}

}
