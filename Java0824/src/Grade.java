import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("당신의 학점은 " + grade + "학점 입니다.");
	}

}
