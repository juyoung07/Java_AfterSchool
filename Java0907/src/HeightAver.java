import java.util.Scanner;

public class HeightAver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height[] = new double[5];
		double sum = 0.0;
		for(int i=0; i<height.length; i++)
			height[i] = sc.nextDouble();
		for(int i=0; i<height.length; i++) {
			sum += height[i];
		}
		System.out.println("키의 평균은 " + sum/height.length);

	}

}
