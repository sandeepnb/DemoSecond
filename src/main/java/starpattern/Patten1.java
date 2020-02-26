package starpattern;

public class Patten1 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("hello \n"+"hi \n"+"by");
		
		star2();
	}
		
	
	
	
	public static void star1()
	{
		for (int i = 1; i <=10; i++) {
			for (int j = 9; j >=i; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void star2()
	{
	
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <=10; i++) {
			for (int j = 9; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	

	}
