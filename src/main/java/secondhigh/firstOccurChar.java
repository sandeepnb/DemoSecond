package secondhigh;

import java.util.HashSet;

public class firstOccurChar {

	public static void main(String[] args) {
		
		char[] arr= {'a','c','b','d','b','a','e','f'};
		
		
		char c=firstOccurChar(arr);
		
		System.out.println(c);
		
	}
	
	
	public static char firstOccurChar(char[] arr)
	{
		
		char c=0;
		
		HashSet<Character> hs=new HashSet<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(hs.add(arr[i])==false)
			{
				c=arr[i];
				break;
			}
			else
				hs.add(arr[i]);
		}
		return c;
		
	}
	
	
}
