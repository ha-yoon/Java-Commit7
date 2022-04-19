package method;

public class Ex05 {

		// 메소드 오버로딩
		
		public static void profile(String name) {
			System.out.println("이름 : " + name);
		}
		
		
		public static void profile(String name, int age) {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			}
		
		
		public static void profile(String name, int age, String tel) {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("전화번호 : " + tel);
			}

		
		public static void main(String[] args) {
			
		
			profile("홍길동", 20, "010-1111-7777");
			System.out.println();
			
	}

}
