package secondhigh;

import java.util.HashMap;
import java.util.Map;

public class Try {
	
	
	
	
	public static void main(String[] args) {
		
		
		String str="hihi";
		System.out.println(countHi(str));
		
		//System.out.println(str.substring(str.length()-1,str.length()));
	}
	
	//hihi
	
	
	
	
	
	
	
	
	public static int countHi(String str) {
		  
	    int count=0;
	    //str=str.toLowerCase();
	    
	    
		for (int i = 0; i < str.length()-1; i++) {
			
			String str2=str.substring(i, i+2);
			
			if(str2.equals("hi"))
			{
				count++;
			}
			
		}
		
		
		return count;
	}
	
	
	
	public String doubleChar(String str) {
		  
		String str2="";  
		char[] arr=str.toCharArray();
		
		  
		
		for (int i = 0; i < arr.length; i++) {
			
			str2=str2+str.charAt(i)+str.charAt(i);
			
		}
		
		
	return str2;	  
	}
	
	
	
	public static Map<String, String> pairs(String[] strings) {
		  
		  
		  HashMap<String, String> map=new HashMap<String, String>();
		  
		  for(int i=0;i<strings.length;i++)
		  {
		    map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1,strings[i].length()));  
		  }
		  return map;
		  
		}
	
	public static Map<String, Integer> wordLen(String[] strings) {
		  
		  
		  HashMap<String, Integer> map=new HashMap<String, Integer>();
		  
		  for(int i=0;i<strings.length;i++)
		  {
		    map.put(strings[i],strings[i].length());  
		  }
		  return map;
		  
		}
	
	public static Map<String, Integer> wordCount(String[] strings) {
		  
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		
		for(int i=0;i<strings.length;i++)
		  {
			if(map.get(strings[i])!=null)
			{
				map.put(strings[i], map.get(strings[i]+1));
			}
			else map.put(strings[i],1);
		  }
		
		return map;
	}
	
}
