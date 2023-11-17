import java.util.ArrayList;
import java.util.Scanner;

public class StudentProjectMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<StudentProject> stuList = new ArrayList<StudentProject>();
	public static void main(String[] args) {
		
		int choice;
		
		while(true) {
			// menu
			System.out.println("-------------");
			System.out.println("1. 학생 입력");
			System.out.println("2. 학생 검색");
			System.out.println("3. 학생 조회");
			System.out.println("4. 학생 수정");
			System.out.println("5. 학생 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println();
			System.out.print("메뉴를 입력하세요: ");
			choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			switch (choice) {
			case 1: 
				addInput();
				break;
			case 2: 
				search();
				break;
			case 3: 
				cheak();
				break;
			case 4: 
				correction();
				break;
			case 5: 
				remove();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}
	
	// 학생 정보 입력
	public static void addInput() {
		System.out.println("\n-----이름 입력-----");
		System.out.print("학생 이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.print("학번을 입력하세요: ");
		int hb = sc.nextInt();
		System.out.print("전화번호를 입력하세요: ");
		String phone = sc.next();
		System.out.print("입력되었습니다.");
		
		stuList.add(new StudentProject(name, age, hb, phone));
	}

	// 학생 검색
	public static void search() {
		System.out.println("검색하실 학생의 이름을 입력하세요: ");
		String name = sc.next();
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).name.equals(name)) {
				stuList.get(i).show();
			}
			if(!stuList.get(i).name.equals(name)){
				System.out.println("학생의 이름이 잘못되었거나 정보가 없습니다.");
				break;
			}
		}
	}
	
	// 학생 조회
	public static void cheak() {
		for(int i=0; i<stuList.size(); i++) {
			stuList.get(i).show();
		}
	}
	
	// 학생 정보 수정
	public static void correction() {
		System.out.print("정보를 바꿀 학생의 이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("수정할 나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.print("수정할 학번을 입력하세요: ");
		int hb = sc.nextInt();
		System.out.print("수정할 전화번호를 입력하세요: ");
		String phone = sc.next();
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).name.equals(name)) {		
				stuList.get(i).age = age;
				stuList.get(i).hb = hb;
				stuList.get(i).phone = phone;
			}
		}
	}
	
	// 학생 정보 삭제
	public static void remove() {
		System.out.println("정보를 삭제할 학생의 이름을 입력하세요: ");
		String name = sc.next();
		String yn;		// 예 또는 아니요
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).name.equals(name)) {
				// 지울지 다시 묻기
				System.out.println("정말 삭제하시겠습니까?");
				System.out.print("(네) 또는 (아니요): ");
				yn = sc.next();
				if(yn.equals("네") || yn.equals("예"))
					stuList.remove(i);
					System.out.println("삭제되었습니다.");
			}
			else if(!stuList.get(i).name.equals(name)){
				System.out.println("잘못된 이름입니다.");
			}
		}
	}

}
