import java.util.Scanner;

public class SwitchCafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 커피를 드릴까요: ");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
			case "달고나커피":
				price = 3500;
				break;
			case "아메리카노":
			case "아아":
				price = 2000;
				break;
			default:
				System.out.println("없는 메뉴입니다.");		
		}
		if(price!=0)
			System.out.println(order + "는 " + price + "원입니다.");
		sc.close();
	}

}
