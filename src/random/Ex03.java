package random;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 로또 게임
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] mylotto = new int[6];
		
		int count = 0;
		
		// 1.로또번호 뽑아서 lotto 배열의 각 요소에 저장하기
		
		for(int i = 0; i < lotto.length; i++) {
					
					lotto[i] = (int)(Math.random()*45) + 1;
					
					for(int j = 0; j < i; j++) {
						
						if(lotto[i] == lotto[j]) {
							i--;
							break;
						}
					}
				}
		
		// 2.내가 1 ~ 45까지의 정수를 입력해서 
		//   myLotto 배열의 각 요소에 저장하기
		for(int i = 0; i < mylotto.length; i++) {
			
			System.out.println(i+1 + "번째 로또번호를 입력 : ");
			mylotto[i] = scan.nextInt();
			
			if(mylotto[i] < 1 || mylotto[i] > 45) {
				System.out.println("1에서 45사이의 정수를 입력해주세요");
				i--;
				continue;
			}
			
			for(int j = 0; j < i; j++) {
				
				if(mylotto[i] == mylotto[j]) {
					System.out.println("같은 번호 중복 입력 불가합니다.");
					i--;
					break;
				}
			}
		}
		
		// 3.내가 입력한 번호와 lotto 번호를 비교해서
		//   몇 개나 맞추었는지 알아보기 
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(mylotto[i] == lotto[j]) {
					count++;
				}
			}	scan.close();
		}
		
		System.out.printf("이번주 로또 번호는~?: %d, %d, %d, %d, %d, %d 입니다.\n",
				lotto[0], lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
		
		System.out.println(count + " 개를 맞추셨습니다~");
		
	}

}
