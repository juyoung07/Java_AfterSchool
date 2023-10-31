import java.util.Scanner;

public class TryCatch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");	// 사용자가 문자를 입력하면 InputMismatchExcepion에러가 나옴
		int sum = 0, n = 0;
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + " >>> ");
			try {
				n = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				sc.next();	// 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--;	// 인덱스가 증가하지 않도록 미리 감소
				continue;
			}
		}
		System.out.println("끝");
	}

}
