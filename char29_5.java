package pattrn;

public class char29_5
{
	public static void main(String[] args) {
		int i=0;
		int j=0;
		printPattern(i,j);
		

	}
	private static void printPattern(int i, int j)
	{
		if(i<12)
		{
			if(j<=7)
			{
				if(j-i<-5)
					System.out.print((char)(65+j));
				else if(j+i<=5)
					System.out.print((char)(65+j));
				else
					System.out.print(" ");
			}
			j++;
			if(j==6)
			{
				j=0;
				i++;
				System.out.println();
			}
			printPattern(i, j);
		}
	}
}
