import java.util.Scanner;

public class Grade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요(1~4): ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		if(grade!=4) {
			if(score>=60)
				System.out.println("합격입니다!");
			else
				System.out.println("불합격입니다.");
		}
		else {
			if(score>=70)
				System.out.println("합격입니다!");
			else 
				System.out.println("불합격입니다.");
		}
			
	sc.close();
	}

}
