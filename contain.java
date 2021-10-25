package String;

public class contain {

	public static void main(String[] args) {
		String s1="dsdf";
		String s2="df";
		System.out.println(s1.contains(s2));
		if(s2.length()>s1.length())
			System.out.println(false);
		else
			System.out.println(contains(s1,s2,0,0));
	}

	private static boolean contains(String s1, String s2, int i, int j) 
	{
		if(s2.isEmpty())
			return true;
		if(j<=s2.length())
		{
			if(i<s1.length())	
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					if(j==s2.length())
						return true;
					j++;
				}
				else
					j=0;
			}
			i++; 
			if(i>s1.length())
				return false;
			return contains(s1, s2, i, j);
		}
		
		return false;
	}

}
