package pattrn;

public class number39 {
	static int i=0,j=0;
	public static void main(String[] args) 
	{
		numverprint();

	}
	private static void numverprint()
	{
		if(i<5)
		{
			if(j<6)
			{
				if(j-i<=0)
					System.out.print(j+1);
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
