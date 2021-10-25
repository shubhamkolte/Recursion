package oct_21;

public class reomoveExtraSpace {

	public static void main(String[] args) {
		String s="      jkgdf     kgjdf   gf           j  dffn   ";
		s=s.trim();
		String s1="";
		int i=0;
		String snew=removeExtrasp(s,i,s1);
		System.out.println(snew);
	

	}

	private static String removeExtrasp(String s, int i, String s1) {
		if(i<s.length())
		{
			if(s.charAt(i)==' ' && s.charAt(1+i)==' ')
				return removeExtrasp(s, ++i, s1);
			else
			{
				s1=s1+s.charAt(i);
				return removeExtrasp(s, ++i, s1);
			}
		}
		return s1;
	}

}
