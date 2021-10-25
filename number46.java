package pattrn;

public class number46 {

	static int i=0,j=0;
	public static void main(String[] args) 
	{
		number1();

	}

	private static void number1() 
	{
		if(i<9)
		{
			if(j<10)
			{
				if(j-i<=0)
					System.out.print(i+1);
				else
					System.out.print(" ");
			}
			j++;
			if(j==9)
			{
				i++;
				j=0;
				System.out.println();
			}
			 number1();
		}
	}
}
