package secondhigh;

import java.util.Scanner;

public class kthHighestNum {

	public static void main(String[] args) {

		int[] arr = { 3131313,4,24,2453533,53,5,3,5,36,46,47,5,757,5 };

		int result = kthHighNum(arr);

		System.out.println(result);

	}

	public static int kthHighNum(int[] arr) {
	
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Kth Highest Value");
		int k=scan.nextInt();
		
		
		
		int kthVal=0;

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				if(i==k-1)
				{
					kthVal =arr[i];
				}
				
			
		}
		return kthVal;
	}
}
