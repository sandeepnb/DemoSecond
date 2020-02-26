package secondhigh;

public class Reverse {
	
	
	
	public static void main(String[] args) {
		
		
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		 arr=reverseArray(arr);
		 
		 for(int a:arr)
		 {
			 System.out.println(a);
		 }
		
		
		
	}

	
	public static int[] reverseArray(int[] arr1)
	{
		
		int[] arr2=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[arr1.length-1-i];
		}
				return arr2;
	}
}
