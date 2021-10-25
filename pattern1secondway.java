package pattrn;

public class pattern1secondway {

	public static void main(String[] args)
	{
		int i=0;
		printI(i);

	}

	private static void printI(int i)
	{
		if(i<5)
		{
			int j=0;
			PrintJ(i,j);
			System.out.println();
			printI(i+1);
			
		}
		
	}

	private static void PrintJ(int i, int j) 
	{
		if(j<5)
		{
			if(j+i<5)
				System.out.print("*");
			else
				System.out.print(" ");
			PrintJ(i, j+1);
		}
		
	}

}
