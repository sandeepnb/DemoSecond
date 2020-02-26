package secondhigh;

public class SecondHigh {
	
	

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		int secMax=secondHigh( arr );
		System.out.println(secMax);
		
		
	}
	
	
	
	public static int secondHigh(int[] arr )
	{
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>secMax && arr[i]!=max)
			{
				secMax=arr[i];
			}
		}
		return secMax;
		
	}

}
