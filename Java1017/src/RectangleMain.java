
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(10, 10);
		int area = box.getArea();
		int round = box.getRound();
		System.out.println(area + " " + round);
		
		Rectangle colPaper = new Rectangle(12, 15);
		int area2 = colPaper.getArea();
		int round2 = colPaper.getRound();
		System.out.println(area2 + " " + round2);
		
		Rectangle notebook = new Rectangle(15,30);
		int area3 = notebook.getArea();
		int round3 = notebook.getRound();
		System.out.println(area3 + " " + round3);

	}

}
