package oct_21;

public class uppercase {

	public static void main(String[] args) {
		String s1="abcd@Abc";
		char[] s=s1.toCharArray();
		touppercase(s,0);
		s1=new String(s);
		System.out.println(s1);

	}

	private static void touppercase(char[] s, int i) {
		if(i<s.length)
		{
			char ch=s[i];
			if(ch>='a'  &&  ch<='z')
			{
				s[i]=(char)(ch-32);
			}
			touppercase(s, ++i);
		}
	}

}
