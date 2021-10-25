package pattrn;

public class char35_10 {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int num=64;
		printPattern(i,j,num);
		

	}
	private static void printPattern(int i, int j,int num)
	{
		if(i<6)
		{
			if(j<=7)
			{
				if(j-i<=0)
					System.out.print((char)(++num));
				
				else
					System.out.print(" ");
			}
			j++;
			//num++;
			if(j==6)
			{
				j=0;
				i++;
				System.out.println();
			}
			printPattern(i, j,num);
		}
	}

}
