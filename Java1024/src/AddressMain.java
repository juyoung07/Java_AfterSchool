import java.util.Scanner;

public class AddressMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
//		int intArr[] = new int[10];
		
		// 클래스 타입의 배열
		Address addrArr[] = new Address[10];	// 멤버 변수가 다 들어가있음
	
		
		
		
		while(true) {
			// menu
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.print("메뉴를 입력하세요: ");
			int input = sc.nextInt();
			
			if(input==0)
				break;
			
			switch(input){
				case 1:
					addInput();
					break;
					
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("잘못된 입력입니다.\n");
					break;
				
			}
		}

	}
		public static void addInput() {
			System.out.println("\n---주소록 입력---");
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			System.out.println("전화번호를 입력하세요: ");
			String phone = sc.next();
			System.out.println("회사 이름을 입력하세요: ");
			String company = sc.next();
			
			Address addr1 = new Address(name, phone, company);
			System.out.println(addr1.print());

//			addrArr[0] = addr1;
		}

}
