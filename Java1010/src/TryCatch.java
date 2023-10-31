import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int dividend;	// 나뉨수
			int divisor;	// 나눔수
			
			System.out.print("나뉨수를 입력하시오: ");
			dividend = sc.nextInt();
			System.out.print("나눔수를 입력하시오: ");
			divisor = sc.nextInt();
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");

		} catch (Exception e) {		// 에러가 나면 catch로 옴
			System.out.println("error catch");
			System.out.println("0으로 나눴기 때문에 에러가 났습니다.");
			e.printStackTrace();	// stack에 에러가 난 곳을 프린트 해주는 것
		}
		
		
		
	}

}
