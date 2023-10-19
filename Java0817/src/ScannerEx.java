import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름, 나이, 키, 체중을 써봅시다.");
		
		String name = sc.next();
		System.out.println("이름: " + name);
		
		int age = sc.nextInt();
		System.out.println("나이: " + age);
		
		double height = sc.nextDouble();
		System.out.println("키: " + height);
		
		double weight = sc.nextDouble();
		System.out.println("체중: " + weight);
		

	}

}
