package oct_21;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String s="aaa bbb ccc eee fff ggg gg";
	System.out.println(	countSpace(s,0,0));
	
	String sa[]=new String[countSpace(s,0,0)+1];
	String s1="";
	addSaStrinng(s,0,sa,0,s1);
	System.out.println(Arrays.toString(sa));

	}

	private static void addSaStrinng(String s, int i, String[] sa, int index, String s1)
	{
		if(i<s.length())
		{
			if(s.charAt(i)==' ')
			{
				sa[index++]=s1;
				s1="";
				addSaStrinng(s, ++i, sa, index, s1);
			}
			else
			{
				s1=s1+s.charAt(i);
				addSaStrinng(s, ++i, sa, index, s1);
			}
		}
		else
		{
			sa[index]=s1;
		}
		
	}

	private static int countSpace(String s, int i,int space) 
	{
		if(i<s.length())
		{
			if(s.charAt(i)==' ')
			{
				space++;
			}
			return countSpace(s, ++i, space);
		}
		
		return space;
	}

}
