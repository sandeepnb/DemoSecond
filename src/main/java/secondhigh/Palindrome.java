package secondhigh;

public class Palindrome {
	
	public static void main(String[] args) {
		
		
		String str="A Santa Lived as a Devil at NASA";
		
		boolean result=isPalindrome(str);
		System.out.println(result);
		
	}

	
	public static boolean isPalindrome(String str)
	{
		boolean result=false;
		String str2="";
		
		str=str.replaceAll(" ", "").toLowerCase();
		
		
		for (int i = str.length()-1; i >=0; i--) {
			
			str2=str2+str.charAt(i);
			
		}
		
		
		if(str.equalsIgnoreCase(str2))
		{
			result=true;
		}
		else
			result=false;
		
		return result;
		
	}
}
