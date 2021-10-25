package pattrn;

public class number43 {

	public static void main(String[] args) {
		int i=0,j=0;
		patternprinting(i,j);

	}

	private static void patternprinting(int i, int j)
	{
		int k=0;
		if(i<5)
		{
			if(j<=5)
			{
				if(j+i>3)
					System.out.print(j+" ");
				else
				{
					System.out.print(" ");
					k++;
				}
			}
			j++;
			if(j==5)
			{
				i++;
				j=0;
				System.out.println();
			}
			patternprinting(i, j);
		}
		
	}

}
