package secondhigh;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class DuplicateOccur {
	
	
	
	
	public static void main(String[] args) {
	
		
		
		String str="hellomydearhowareyou";
		
		//find duplicate occurence of each character

		char[] arr=str.toCharArray();
		int count=0;
		
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.get(arr[i])!=null)
			{
				map.put(arr[i],map.get(arr[i])+1);
				
			}
			else 
				map.put(arr[i],1);
		}
		
		System.out.println(map);
		
		
	}
}