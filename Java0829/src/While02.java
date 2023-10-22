import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		System.out.print("입력을 끝내려면 -1을 입력하세요: ");
		
		int input = sc.nextInt();
		while(input != -1) {
			count++;
			sum += input;
			input = sc.nextInt();
		}
		if(count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 갯수는 " + count + "개 이며, ");
			System.out.println("평균은 " + sum/(double)count + "입니다.");
		}

	}

}
