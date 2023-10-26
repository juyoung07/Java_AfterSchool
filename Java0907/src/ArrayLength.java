import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int IntArray[] = new int[5];
		int sum = 0, even = 0, odd = 0;
		
		System.out.print(IntArray.length + "개의 정수를 입력하세요: ");
		for(int i=0; i<IntArray.length; i++)
			IntArray[i] = sc.nextInt();
		for(int i=0; i<IntArray.length; i++) {
			sum += IntArray[i];
			
			if(IntArray[i]%2==0)
				even += IntArray[i];
			else if(IntArray[i]%2==1)
				odd += IntArray[i];
		}
			
		System.out.println("평균: " + (double)sum/IntArray.length);
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);

	}

}
