
public class Rectangle {
	int width;
	int height;
	
	public Rectangle(){}
	public Rectangle(int width){
		this.width = width;
	}
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getArea(){
		int area = width*height;
		return area;
	}
	public int getRound() {
		int round = (width*2)+(height*2);
		return round;
	}
}
	
	
	
	
	
	
	
	
	
	
