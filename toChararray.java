package oct_21;

import java.util.Arrays;

public class toChararray {

	public static void main(String[] args) {
		String s1="patya";
		char[] sa=new char[s1.length()];
		toArraychar(s1,sa,0);
		System.out.println(Arrays.toString(sa));

	}

	private static void toArraychar(String s1, char[] sa, int i) 
	{
		if(i<sa.length)
		{
			sa[i]=s1.charAt(i);
			toArraychar(s1, sa, ++i);
		}
		
	}

}
