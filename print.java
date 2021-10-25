package String;

public class print 
{
	public static void main(String[] args)
	{
		 String s1="abcdef";
		 int i=0;
		 print1(s1,i);

	}

	private static void print1(String s1,int i) 
	{
		if(i<s1.length())
		{
			System.out.print(s1.charAt(i));
			print1(s1,i+1);
			
		}
		
	}

}
