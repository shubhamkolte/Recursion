package pattrn;

public class pattern2 {

	public static void main(String[] args) 
	{
		int i=0;
		int j=0;
		printPattern(i,j);
		

	}
	private static void printPattern(int i, int j)
	{
		if(i<5)
		{
			if(j<5)
			{
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			j++;
			if(j==5)
			{
				j=0;
				i++;
				System.out.println();
			}
			printPattern(i, j);
		}
		
	}

}
