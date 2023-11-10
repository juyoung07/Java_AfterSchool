import java.util.Scanner;

public class Address {
	Scanner sc = new Scanner(System.in);
	
	String name;
	String phone;
	String company;
	String date;
	
	public Address() {}
	public Address(String name, String phone, String company) {
		this.name = name;
		this.phone = phone;
		this.company = company;
	}
	public Address(String name, String phone, String company, String date) {
		this.name = name;
		this.phone = phone;
		this.company = company;
		this.date = date;
	}
	
	public String print() {
		return "주소록 [이름: " + name + ", 전화번호: " + phone + ", 회사: " + company + "]";
	}
	
}
