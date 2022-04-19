package method;

public class Ex08 {



		// 1 ~ 10까지 정수 중 하나를 반환해주는 randomSu 메소드 만들기
		public static int randomSu() {
			System.out.println("randomSu()실행");
			int su = (int)(Math.random() * 10) + 1;
			return su;
		}
	
	
		// 정수 하나를 매개변수로 받아 정수길이만큼 int타입 배열을 만들고
		// 정수 1부터 차례대로 배열의 요소에 저장한 다음 
		// 배열을 반환해주는 arrayFill 메소드 만들기
		public static int[] arrayFill(int length) { 
			System.out.println("arrayFill() 실행");	
			int[] array = new int[length];
			
		for(int i = 0; i < length; i++) {
			array[i] = i + 1;
		}
		
		return array;
	
}
	

		// int 배열을 받아서 배열 안의 요소를 출력해주는 arrayPrint 메소드 만들기
		public static void arrayPrint(int[] array) {
			System.out.println("arrayPrint() 실행");
			
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
		
		public static void main(String[] args) {
			
			int su = randomSu();
			int[] array = arrayFill(su);
			arrayPrint(array);
			
	}

}
