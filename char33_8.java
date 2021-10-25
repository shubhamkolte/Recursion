package pattrn;

public class char33_8 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		printPattern(i,j);
		

	}
	private static void printPattern(int i, int j)
	{
		if(i<6)
		{
			if(j<=7)
			{
				if(j-i<=0)
					System.out.print((char)(70+j));
				
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
