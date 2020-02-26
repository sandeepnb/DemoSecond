package secondhigh;

import java.util.Arrays;

public class anagram {
	
	
	
	public static void main(String[] args) {
		
		
		String str1="Cinema";
		String str2="Iceeman";
		
		
		boolean result=isAnagram(str1, str2);
		System.out.println(result);
		
	}
	
	
	public static boolean isAnagram(String str1, String str2)
	{
		
		boolean result=false;
		str1=str1.replaceAll(" ", "").toLowerCase();
		str2=str2.replaceAll(" ", "").toLowerCase();
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
				
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//return Arrays.equals(arr1, arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			
			if(arr1[i]==arr2[i])
			{
				result= true;
			}
			else 
				result=false;
		}

		return result;
	}
	
	
	
}
