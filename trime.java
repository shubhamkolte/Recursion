package oct_21;

public class trime {

	public static void main(String[] args) 
	{
		String s="     jkdgl  hgd      ";
		System.out.println(s.trim());
		String s1="n";
		int j=s.length()-1;
		trimee(s,0,s1,0,j);
		System.out.println(s1);

	}

	private static void trimee(String s, int i, String s1, int j, int j2) 
	{
		if(i<s1.length())
		{
			if(s.charAt(i)!=' ' &&s.charAt(i+1)!=' ')
			{
				addString(s1,i,s);
			}	
				trimee(s, ++i, s1, j, j2);	
		}
	
		
	}

	private static void addString(String s1, int i, String s)
	{
		if(i<s.length())
		{
			s1=s1+s.charAt(i);
			addString(s1, ++i, s);
		}
		
	}

}
