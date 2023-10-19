import java.util.Scanner;
public class CircleArea2 {

	public static void main(String[] args) {
		final double PI = 3.14; // 원주율을 상수로 선언(PI)
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 이름을 입력하세요: ");
		String CircleName = sc.next();
		
		System.out.print("원의 반지름을 입력하세요: ");
//		double radius = sc.nextDouble();	//원의 반지름
		int radius = sc.nextInt();			//정수로 반지름 받기
		sc.close();
		double circleArea = radius*radius*PI; //원의 면적 계산
		
		System.out.println("원의 이름: " + CircleName + ", 원의 반지름 = " + radius + ", 원의 면적 = " + circleArea);
		
	}

}
