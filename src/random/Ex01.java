package random;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		
		int myNumber = (int)(Math.random()*6);
		
		System.out.println(myNumber);
		
		// 주사위 번호 하나를 뽑아서 출력해보기 
		myNumber = (int)(Math.random()*6) + 1;
		System.out.println("내 주사위 번호? : " + myNumber);
		
		
	}

}
