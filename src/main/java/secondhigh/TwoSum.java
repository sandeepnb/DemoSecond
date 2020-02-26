package secondhigh;

public class TwoSum {
	
	public static void main(String[] args) {
		
		
		int num=10;
		
		int[] arr= {1,2,5,7,12,6,4};
		
		
		int k=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				
				if(i+j==num && i!=j)
				{
					System.out.println(i+"  "+j);
				}
			}
			
			
		}
		
		
		
		
		
		
	}
	

}
