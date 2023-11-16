
public class StudentArrayList {
	String name;
	int age;
	int stuld;
	String phone;
	
	public StudentArrayList() {}
	public StudentArrayList(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	void show() {
		System.out.println(name + ", " + age + ", " + phone);
	}
	
}
