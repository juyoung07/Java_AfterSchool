// 영화 Movie 클래스를 정의해보자
// Movie 클래스는 영화 제목, 평점, 감독, 발표된 연도의 멤버변수를 가짐
public class Movie {
	String title;
	Double score;
	String director;
	int year;
	
	public Movie(){}
//	public Movie(String title, Double score) {
//		this.title = title;
//		this.score = score;
//	}
	public Movie(String title, Double score, String director, int year) {
		this.title = title;
		this.score = score;
		this.director = director;
		this.year = year;
	}
	
	public void print() {
		System.out.println(title + " " + score + " " + director + " " + year);
	}

}
