import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, max = 0;
		int input[] = new int[5];
		System.out.print("수 5개를 입력하세요: ");
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
			
			// 최댓값 구하기
			if(input[i] > max)
				max = input[i];
			
			// 합 구하기
			if(input[i] > 0)
				sum += input[i];
		}
		System.out.println();
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		System.out.println("양수의 합은 " + sum + " 입니다.");
	}

}
