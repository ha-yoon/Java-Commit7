package method;

public class Ex01 {

	public static void method1() {
		System.out.println("void형 메소드는 돌려줄 값이 없음");
	}
	
	
	public static int method2() {
		System.out.println("리턴타임은 int형인 메소드");
		int b = 100;
		return b;
	}

	
	public static void main(String[] args) {
		System.out.println("메인메소드");


		int a;
		
		method1(); 

		a = method2(); 

		System.out.println("method2에서 돌려준 값 : " + a);
	}	
		
		
}