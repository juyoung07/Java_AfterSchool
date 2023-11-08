
public class Date {
	int year;
	int month;
	int day;
	
	public Date() {}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print1() {
		System.out.print(year + "." + month + "." + day + "  ");
	}
	public void print2() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
	
}
