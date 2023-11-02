public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "윤주영";
		st1.stuId = 1211;
		st1.age = 16;
		st1.phone = "010-0000-0000";
		st1.display();
		
		Student st2 = new Student("나지수", 1204, 16, "010-1111-1111");
		st2.display();
		
		Student st3 = new Student("김지혜", 1203, 16, "010-1111-1111");
		st3.display();
		
		Student st4 = new Student("안채연", 1210, 16, "010-1111-1111");
		st4.display();
		
		Student st5 = new Student("박지영", 1207, 16, "010-1111-1111");
		st5.display();
	}

}
