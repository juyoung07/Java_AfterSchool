import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// 정수를 입력받고 입력받은 수까지의 합을 구하시오.
		System.out.print("정수를 입력하세요: ");		// 수를 입력하라고 안내
		Scanner sc = new Scanner(System.in);	// 키보드로 입력 받기
		int input = sc.nextInt();	// 수를 입력 받기
		int sum1 = 0;	// 값을 누적할 변수 초기화
		
		for(int i=0; i<=input; i++) {	// 입력 받은 수까지 반복
			sum1 += i;	// 반복하는 수 누적
			System.out.print(i);	// 반복하는 수 출력
			if(i<input)		// 입력 받은 수보다 작을 때까지 '+'출력
				System.out.print(" + ");
			else {
				System.out.print(" = ");	// 입력 받은 수와 같거나 크면 '=' 출력
				System.out.print(sum1);		// 누적값 출력
			}
		}
		System.out.println();
		
		int i = 1;
		int sum2 = 0;
		while(i<=input) {
			sum2 += i;
			System.out.print( i + " ");
			i++;
		}
		System.out.println();
		System.out.print("누적값: " + sum2);


	}

}
