package oct_21;

public class replaceString {

	static String s2="";
	static String s3="";
	static int count=0;
	public static void main(String[] args) {
		String s1="abcooooooabc";
		String repalceto="abc";
		String byrep="PQr";
		
		System.out.println(s1.replace(repalceto, byrep));
		String s2="";
		s2=myReplace(s1,0,s2,0,repalceto,byrep,0);
		System.out.println(s2);
		
		

	}

	private static String myReplace(String s1, int i, String s2, int j, String repalceto, String byrep, int k) {
		if(i<s1.length())
		{
			if(j<=byrep.length())
			{
				if(s1.charAt(i)==repalceto.charAt(j))
				{
					if(byrep.length()-1==j)
					{
						s2=s2+byrep;
						count=1;					//i=i+byrep.length();
						j=0;
					}
					else
					{
						j++;
						s3=s3+s1.charAt(i);
					}
				}
				else if(j<byrep.length())
				{
					i=i-j;
					s2=s2+s1.charAt(i);
					if(count==1)
						i=s2.length()-1;
					else
						i=s2.length()+1;
				}
				
				else
				{
													//j=0;
					s2=s2+s1.charAt(i);
				}
					
			}
			
			return myReplace(s1, ++i, s2, j, repalceto, byrep, k);
			
			
		}
		return s2;
		
	}

}
