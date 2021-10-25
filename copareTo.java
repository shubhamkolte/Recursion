package String;

public class copareTo {

	public static void main(String[] args)
	{
		String s1="aaabcd";
		String s2="ppabcdef";
		System.out.println(comparto(s1,s2,0)); 
		
		System.out.println(s1.compareTo(s2));
		

	}

	private static int comparto(String s1, String s2, int i) {
		if(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
			else  
				return comparto(s1, s2, ++i);
		
		}
		return s1.length()-s2.length();
	}

}
