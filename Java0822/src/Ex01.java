import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a, b, c, d; 
		 System.out.print("a의 값을 입력하시오: ");
		 a = sc.nextInt();
		 System.out.print("b의 값을 입력하시오: ");
		 b = sc.nextInt();
		 System.out.print("c의 값을 입력하시오: ");
		 c = sc.nextInt();
		 System.out.print("d의 값을 입력하시오: ");
		 d = sc.nextInt();
		 System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		 
		 a = d++;
		 System.out.println("a = " + a + ", d = " + d);
		 a = ++d;
		 System.out.println("a = " + a + ", d = " + d);
		 a = d--;
		 System.out.println("a = " + a + ", d = " + d);
		 a = --d;
		 System.out.println("a = " + a + ", d = " + d);

	}

}
