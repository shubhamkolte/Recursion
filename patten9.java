package pattrn;

public class patten9 {

	static int i=0,j=0;
	public static void main(String[] args)
	{
		pattern();
	}
	private static void pattern()
	{
		if(i<=10)
		{
			if(j<=5)
			{
				if(j+i>4 && i<=5)
					System.out.print("* ");

				else
					System.out.print(" ");
			}
			j++;
			if(j==7)
			{
				j=0;
				i++;
				System.out.println();
			}
			pattern();
		}
	}
		
}
