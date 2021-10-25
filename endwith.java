package oct_21;

public class endwith {

	public static void main(String[] args) 
	{
		String s1="kolte";
		String s2="telhkhj";
		System.out.println(s1.endsWith(s2));
		int i=s1.length()-1;
		int j=s2.length()-1;
		if(s2.length()>s1.length())
			System.out.println(false);
		else
			System.out.println(endWith(s1,i,s2,j));
		

	}

	private static Boolean endWith(String s1, int i, String s2, int j)
	{
		if(j>=0)
		{
			if(s1.charAt(i)==s2.charAt(j))
				return endWith(s1, --i, s2, --j);
			else
				return false;
		}
		return true;
		
	}

}
