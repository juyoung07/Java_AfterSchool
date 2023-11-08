
class Dice {	// class가 두 개라면 하나는 public이 없어야 함
	
	private int face;
	int roll() {
		int face = (int)(Math.random()*6) + 1;
		return face;
	}	
}
public class DiceTest {		// Main 함수가 있는 것에 public, 그리고 파일 이름이 같아야 함

	public static void main(String[] args) {
		Dice dice = new Dice();
		System.out.println("주사위 숫자: " + dice.roll());

	}

}