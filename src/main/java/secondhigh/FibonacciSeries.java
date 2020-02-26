package secondhigh;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		
		
		int[] arr=fibonacciSeries(15);
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		
		
	}
	
	
	
	public static int[] fibonacciSeries(int num)
	{
		
		int[] arr=new int[num];
			
			int a=0;
			int b=1;
			int c=0;
			
			for (int j = 0; j < arr.length; j++) {
				
				c=a+b;
				a=b;
				b=c;
				arr[j]=c;	
			}	
	
		return arr;
	}

}
