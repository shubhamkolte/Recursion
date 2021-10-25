package pattrn;

public class pattern5 {
	public static void main(String[] args) 
{
	int i=0;
	int j=0;
	printPattern(i,j);
	

}
private static void printPattern(int i, int j)
{
	if(i<9)
	{
		if(j<6)
		{
			if(j+i<5 && i<=4)
				System.out.print("*");
			else if(j-i<-3 && i>=4)
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
