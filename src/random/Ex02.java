package random;

public class Ex02 {

	public static void main(String[] args) {

		// 배열과 random 메소드로 로또번호 수정하기
		
		int[] lotto = new int[6];
		
		// 1 ~ 45까지 정수를 뽑은 후 배열의 각 요소에 저장
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for(int j = 0; j < i; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}

	}

}
