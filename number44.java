package pattrn;

public class number44 {

	static int i=0,j=0;
	public static void main(String[] args) 
	{
		numverprint();

	}
	private static void numverprint()
	{
		if(i<5)
		{
			if(j<=5)
			{
				if(j+i>3)
				{
					System.out.print(i+1+" ");
				}
				else
					System.out.print(" ");
			}
			j++;
			if(j==5)
			{
				i++;
				j=0;
				System.out.println();
			}
			numverprint();
		}
		
		
		
	}

}
