package programs;

import java.util.Scanner;

public class PersonalInfo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter ypur mobile no:");
		int mob = obj.nextInt();
	
		System.out.println("Enter your name:");
		String name = obj.next();
		
		System.out.println("Enter ypur address:");
		String addr = obj.next();
		
		System.out.println("Info enter");
	}
}
