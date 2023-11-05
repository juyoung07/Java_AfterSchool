
public class DogMain {

	public static void main(String[] args) {
		Dog d1 = new Dog("초코", "닥스훈트", 4, "갈색/검정색");
		System.out.println(d1.name + " " + d1.breed + " " + d1.age + " " + d1.color + " " + d1.barking());
		
		Dog d2 = new Dog("뽀삐", "말티즈", 7, "흰색");
		System.out.println(d2.name + " " + d2.breed + " " + d2.age + "세 " + d2.color + " " + d2.sleeping());
	}

}
