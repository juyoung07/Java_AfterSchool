import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// 그냥 내가 한 맛보기 배열
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번째 점수를 입력하세요: ");
			score[i] = sc.nextInt();
		}
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "번째 점수는: " + score[i]);
		}

	}

}
