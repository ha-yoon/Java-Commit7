package method;

import java.util.Scanner;

public class Ex03 {

	
	public static void profileprint(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}	
	
	public static void main(String[] args) {
		
		profileprint("홍길동", 20); 

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름이 어떻게 되시나요? : ");
		String name = scan.next();
		
		System.out.println("나이가 몇 살 인가요? : ");
		int age = scan.nextInt();
		
		profileprint(name, age);
		
		scan.close();
	} 

}
