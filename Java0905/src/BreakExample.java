import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("exit또는 끝을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = sc.nextLine();	// 한 줄 전체를 읽음
			if(text.equals("exit") || text.equals("끝"))
				break;
		}
//		System.out.println();
		System.out.println("종료합니다.");

	}

}
