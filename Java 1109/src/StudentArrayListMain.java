import java.util.ArrayList;

public class StudentArrayListMain {

	public static void main(String[] args) {
		StudentArrayList st1 = new StudentArrayList("윤주영", 17, "010-0000-0000");
		StudentArrayList st2 = new StudentArrayList("김일찐", 17, "010-1717-1717");
		StudentArrayList st3 = new StudentArrayList("나디두", 16, "010-0000-0000");
		StudentArrayList st4 = new StudentArrayList("안대욘", 15, "010-XXXX-XXXX");  // 안채연
		
		ArrayList<StudentArrayList> stList = new ArrayList<StudentArrayList>();		// 개수를 정하지 않은 배열
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		stList.add(new StudentArrayList("희희", 10, "010-7777-7777"));
		for(StudentArrayList st : stList) {
//			System.out.println(st.name + ", " + st.age + ", " + st.phone);
			if(st.age == 17)
				st.show();
		}
		for(int i=0; i<stList.size(); i++) {
			if (stList.get(i).age == 17);{
				stList.get(i).show();
			}
		}
		for(int i=0; i<stList.size(); i++) {
			if(stList.get(i).name.equals("나디두")) {
				stList.get(i).show();
			}
		}
	}

}
