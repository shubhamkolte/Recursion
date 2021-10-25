package oct_21;
public class myIndexOf {
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args)
	{
		String s1="bkdsdfbkdf";
		String s2="bk";
		System.out.println(s1.indexOf(s2));
		if(s1.length() < s2.length())
			System.out.println("-1");
		else
		{
			System.out.println(indexOf(s1,s2,0,0));
		}
	}
	private static int indexOf(String s1, String s2, int i,int j) 
	{
		if(i<s1.length())
		{
			if(j<s2.length())
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					if(j==s2.length()-1)
					{
						if(min>=j)
						{
							min=i;
						return min;
						}
					}
					j++;
				}
//				else
//					i=0;
			}
			i++; 
			if(j>=s2.length())
				return -1;
			return indexOf(s1, s2, i, j);
		}
		return -1;
	}
}
