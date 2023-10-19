import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번을 입력하세요: ");
		int number = sc.nextInt();
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("전공을 입력하세요: ");
		String jeungong = sc.next();
		
		System.out.println("당신의 학번은 " + number + "이고 이름은 " + name + "이며 전공은 " + jeungong + "입니다.");
	}

}
