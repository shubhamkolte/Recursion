package pattrn;

public class pattern50 {
	static int i=0,j=0,k=0;
	public static void main(String[] args) 
	{
		number1();

	}

	private static void number1() 
	{
		k=0;
		if(i<9)
		{
			if(j<27)
			{
				if(k<3)
				{				
					System.out.print(k);
				}
				
			}
			j++;
			k++;
			if(k==3)
			{
				i++;
				
				j=0;
				System.out.println();
			}
			 number1();
		}
	}

}
