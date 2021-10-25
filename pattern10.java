package pattrn;

public class pattern10 {
	static int i=0,j=0;
	public static void main(String[] args)
	{
		pattern();
	}
	private static void pattern()
	{
		if(i<=14)
		{
			if(j<=10)
			{
				if(j+i>10)
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			j++;
			if(j==10)
			{
				j=0;
				i=i+2;
				System.out.println();
			}
			pattern();
		}
	}

}
