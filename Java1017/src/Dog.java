// 강아지를 나타내는 클래스 Dog을 만들기
// 강아지 이름, 종, 나이, 색깔의 멤버변수를 가짐
public class Dog {
	String name;
	String breed;
	int age;
	String color;
	
	public Dog() {}
//	public Dog(String name, String breed) {
//		this.name = name;
//		this.breed = breed;
//	}
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public String barking() {
		return "멍멍 짖는다";
	}
	public String sleeping() {
		return "ZZzz...";
	}
}
