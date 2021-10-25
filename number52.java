package pattrn;

public class number52 {
	static int i=0,j=0;
	public static void main(String[] args) 
	{
		numverprint();

	}
	private static void numverprint()
	{
		if(i<9)
		{
			if(j<=9)
			{
				if(j+i>7)
				{
					System.out.print(i+1+" ");
				}
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
			numverprint();
		}
	}
		

}
