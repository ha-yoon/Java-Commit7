package method;

public class Ex04 {

		// 전원을 킵니다. 추출력해주는 powerOn 메소드와 
		public static void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		
		
		// 매개값 2개를 받아서 더한다음 결과를 반환해주는 add(int x, int y) 메소드를 만들기 
		public static int add(int x, int y) {
			int result;
			result = x + y;
			return result;
		}
		
		
		public static void main(String[] args) {
		
			powerOn();
			int sum = add(100,200);
			
			System.out.println("100 + 200 : " + sum);
		
		
	}

}
