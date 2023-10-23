import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			System.out.print("수를 입력하세요: ");
			int input = sc.nextInt();
			if(input<=0)
				continue;
			else
				sum += input;
		}
		System.out.println("양수의 합: " + sum);

	}

}
