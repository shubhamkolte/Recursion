package oct_21;

public class startWith {

	public static void main(String[] args)
	{
		String s1="kolte";
		String s2="kol";
		System.out.println(s1.startsWith(s2));
		int i=0;
		int j=0;
		if(s2.length()>s1.length())
			System.out.println(false);
		else
			System.out.println(startWith11(s1,i,s2,j));
		

	}

	private static Boolean startWith11(String s1, int i, String s2, int j)
	{
		if(j<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(j))
				return startWith11(s1, ++i, s2, ++j);
			else
				return false;
		}
		return true; 
		
	}	

}
