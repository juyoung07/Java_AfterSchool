// 설계도
public class Circle {
	// 속성
	int radius;		// 반지름
	String name;	// 원의 이름
	
	// 기본 생성자 & 생성자
	public Circle(){	// 기본 생성자. 객체를 만들 때 호출
	}
	
	public Circle(int radius, String name) {	// 생성자
		this.radius = radius;
		this.name = name;
	}
	
	// method 원의 면적 구하기
	public double getArea() {
		double mj = 3.14 * radius * radius;
		return mj;
	}
}
