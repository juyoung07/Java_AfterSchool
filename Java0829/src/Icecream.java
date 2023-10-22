import java.util.Scanner;

public class Icecream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("1. 엄마는 외계인 (3000)");
		System.out.println("2. 민트초코 (3000)");
		System.out.println("3. 블랙소르베 (3000)");
		System.out.println("4. 체리쥬빌레 (3500)");
		System.out.println("5. 누가바 (1000)");
		System.out.println("6. 비비빅 (800)");
		System.out.println("7. 바밤바 (900)");
		System.out.println("---------------------");

		int pay = 0;
		int mom = 0, mint = 0, black = 0, cherry = 0, nuga = 0, bibi = 0, babam = 0;
		
		while(true) {
			int count = 0;
			System.out.print("메뉴와 아이스크림의 갯수를 입력하세요(종료하려면 -1): ");
			int menu = sc.nextInt();
			
			// -1을 입력받았다면
			if(menu == -1) {
				System.out.println();
				if(mom>0)
					System.out.println("엄마는 외계인 " + mom + "개");
				if(mint>0)
					System.out.println("민트초코 " + mint + "개");
				if(black>0)
					System.out.println("블랙소르베 " + black + "개");
				if(cherry>0)
					System.out.println("체리쥬빌레 " + cherry + "개");
				if(nuga>0)
					System.out.println("누가바 " + nuga + "개");
				if(bibi>0)
					System.out.println("비비빅 " + bibi + "개");
				if(babam>0)
					System.out.println("바밤바 " + babam + "개");
				System.out.println("지불할 금액은 " + pay + "원입니다.");
				break;
			}
			count = sc.nextInt();
			
			switch(menu) {
				case 1:
					mom += count;
					pay += 3000*count;
					break;
				case 2:
					mint += count;
					pay += 3000*count;
					break;
				case 3:
					black += count;
					pay += 3000*count;
					break;
				case 4:
					cherry += count;
					pay += 3500*count;
					break;
				case 5:
					nuga += count;
					pay += 1000*count;
					break;
				case 6:
					bibi += count;
					pay += 800*count;
					break;
				case 7:
					babam += count;
					pay += 900*count;
					break;	
				case -1:
					break;
				default:
					System.out.println("메뉴를 다시 선택해주세요: ");
			}
			
		} // while
		
	} // main
	
}
