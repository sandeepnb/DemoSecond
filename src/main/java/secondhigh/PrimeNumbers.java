package secondhigh;

public class PrimeNumbers {

	
	
	public static void main(String[] args) {
		
		
		int[] r=prime(100);
		
		for(int t:r)
		{
			if(t>0) {
			System.out.println(t);
			}
		}
		
		
	} 
	
	
	public static int[] prime(int num)
	{
		
		int[] arr=new int[num];
		
		int temp=0;
		
		for (int i = 1; i < num; i++) {
			for (int j = 2; j < i-1; j++) {
				
				
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
				
				if(temp==0)
				{
					arr[i]=i;
		
				}
				else
					temp=0;
		}
		
		return arr;
	}
	
}
