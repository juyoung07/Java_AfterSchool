// 객체생성
public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 10;
		c1.name = "얼굴'피자\'";
		double area = c1.getArea();
		System.out.println(c1.name + "의 면적은 " + area);
		
		// 객체 2
		Circle gong = new Circle();
		gong.radius = 5;
		gong.name = "아이'공\'";
		area = gong.getArea();
		System.out.println(gong.name + "의 면적은 " + area);
		
		// 객체 3
		Circle doughnut = new Circle(2, "너도나'도넛\'");
		area = doughnut.getArea();
		System.out.println(doughnut.name + "의 면적은 " + area);
		
		
	}

}
