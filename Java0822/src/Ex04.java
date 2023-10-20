
public class Ex04 {

	public static void main(String[] args) {
		// 비트 시프트 연산
		byte c = 20;
		byte d = -8;
		
		System.out.println("[시프트 연산 결과]");
		// c를 2비트 왼쪽으로 시프트
		System.out.println(c << 2);
		// c를 2비트 오른쪽으로 시프트. 0삽입
		System.out.println(c >> 2);
		// d를 2비트 오른쪽 시프트. 1삽입
		System.out.println(d >> 2);
		// d를 2비트 오른쪽 시프트
		System.out.println(d >>> 2);
	}

}
