import java.util.Scanner;

public class ScoreSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int SWcount = 0, sum = 0, score, clas;
		double aver;
		
		System.out.print("몇개의 반을 입력하시겠습니까: ");
		int ban = sc.nextInt();
		for(int i=1; i<=ban; i++) {
			System.out.print("반과 점수를 입력하세요: ");
			clas = sc.nextInt();
			score = sc.nextInt();
			if(clas == 1 || clas == 2) {
				SWcount++;
				sum += score;
			}
			else
				continue;
		}
		aver = sum/(double)SWcount;
		System.out.println("소프트웨어과의 점수 합계는 " + sum + "이고 평균은 " + aver + "입니다.");

	}

}
