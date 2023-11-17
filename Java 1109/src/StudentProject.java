// 학생 리스트 관리 프로그램
public class StudentProject {
	String name;
	int age;
	int hb;
	String phone;
	
	public StudentProject() {}
	public StudentProject(String name, int age, int hb, String phone) {
		this.name = name;
		this.age = age;
		this.hb = hb;
		this.phone = phone;
	}
	
	public void set(String name, int age, int hb, String phone) {
		this.name = name;
		this.age = age;
		this.hb = hb;
		this.phone = phone;
	}
	void show() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 학번: " + hb+ ", 전화번호: " + phone);
	}
	
}
