// 설계도
public class Student {
	// 속성
	String name;
	int stuId;
	int age;
	String phone;
	
	// 기본 생성자 & 생성자
	public Student() {}
	public Student(String name, int stuId, int age, String phone){
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}
	
	// 메소드
	public void display(){
		System.out.println("이름: " + name + "\n학번: " + stuId + "\n나이: " + age + "\n전화번호: " + phone + "\n");
	}
}
