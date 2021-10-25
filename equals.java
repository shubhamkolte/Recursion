package oct_21;

public class equals {

	public static void main(String[] args) {
		String s1="patya";
		String s2="patyakj";
		System.out.println(s1.equals(s2));
		if(s1.length()!=s2.length())
			System.out.println(false);
		else
			System.out.println(chekmyEqaul(s1,s2,0));
		
	}

	private static boolean chekmyEqaul(String s1, String s2, int i) {
		if(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
			else  
				return chekmyEqaul(s1, s2, ++i);
		
		}
		return true;
		
	}

}
