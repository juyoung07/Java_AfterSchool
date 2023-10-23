import java.util.Iterator;

public class Gugudan {

	public static void main(String[] args) {
		int i, j;
		for(i=2; i<10; i++) {
			for(j=1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + (i*j));
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
