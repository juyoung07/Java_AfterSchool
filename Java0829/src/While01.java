import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// 정수를 입력받고 입력받은 수까지의 합을 구하시오.
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=input) {
			sum += i;
			//System.out.print(i + " ");
			i++;
		}
		System.out.print("누적값: " + sum);

	}

}
