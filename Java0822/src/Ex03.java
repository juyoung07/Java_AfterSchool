import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//삼항연산자
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("a의 값(정수)을 입력하세요: ");
		a = sc.nextInt();
		System.out.print("b의 값(정수)을 입력하세요: ");
		b = sc.nextInt();
		
		System.out.println("큰 수에서 작은 수를 뺸 값은: " + ((a>b) ? (a-b) : (b-a)));
	}

}
