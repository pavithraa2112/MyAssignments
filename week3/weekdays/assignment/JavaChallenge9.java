package week3.weekdays.assignment;

public class JavaChallenge9 {

	public static void main(String[] args) {

		//String str = "A man,a plan,a canal:Panama";
		/*String str = " ";
		//String str = "race a car";
		String replace = str.replaceAll("[^a-zA-z]", "");
 
		System.out.println(replace);
		
		String reverStr="";
		
		int strLength= replace.length();
		for (int i=(strLength-1); i>=0; --i)
			
		{
			reverStr=reverStr +replace.charAt(i);
		}
		
		System.out.println(reverStr);

		if(replace.toLowerCase().equals(reverStr.toLowerCase()))
		{
			System.out.println("Palindrome");
		}

		else 
		{
			System.out.println("Not a palindrome");
		}
	}*/
		String str = "A man,a plan,a canal:Panama";
		//String replace = " ";
		String replace = str.replaceAll("[^a-zA-z]", "");
		String reverse = new StringBuffer(replace).reverse().toString();
		//System.out.println(reverse);
		if(replace.equalsIgnoreCase(reverse.toLowerCase()))
		{
			System.out.println("Palindrome");
		}

		else 
		{
			System.out.println("Not a palindrome");
		}
	}

}
