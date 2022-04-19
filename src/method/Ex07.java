package method;

public class Ex07 {

	public static void change1(int a) {
		a = 100;
	}
	
	
	public static void change2(int[] array) {
		array[0] = 100;
	}
	

	public static void main(String[] args) {
	
		int a = 1;
		change1(a);
		
		System.out.println(a);
		
		int[] array = {1, 2, 3, 4, 5};
		change2(array);
		
		System.out.println(array[0]);
	}

}
