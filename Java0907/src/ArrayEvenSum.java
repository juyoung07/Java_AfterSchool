import java.util.Scanner;

public class ArrayEvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[5];
		int sum = 0;
		for(int i=0; i<input.length; i++)
			input[i] = sc.nextInt();
		for(int i=0; i<input.length; i++) {
			if(input[i]<=0)
				continue;
			else
				sum += input[i];
		}
		System.out.println(sum);

	}

}
