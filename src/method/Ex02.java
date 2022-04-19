package method;

public class Ex02 {

	public static void hello() {
		int i = 0;
		
		while(i < 5) {
			System.out.println("안녕하세요");
			i++;
			
			if(i == 3) {
		
				return; 
		
			}
			
			
		}
	}
	
	
	public static void name() {
		System.out.println("저는 홍길동 입니다.");
	}
	
	
	public static void main(String[] args) { 
		
		hello(); 
		
		name(); 
		
		
	}

}
