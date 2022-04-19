package method;

public class Ex06 {

		public static int sum1(int...n) { 
			int sum = 0;
			
			for(int i : n) {
				sum += i;
			}
			return sum;
		}
		
		
		public static int sum2(int[] array) { 
			int sum = 0;
			for(int i : array) {
				sum += i;
			}
			return sum;
		}
		
		
		public static void main(String[]args) {
			
			int sum1 = sum1(1, 2, 3);
			System.out.println(sum1);
			
			int[] array = {1, 2, 3, 4, 5};
			
			int sum2 = sum2(array);
			System.out.println(sum2);
			
			
		}
		
}
