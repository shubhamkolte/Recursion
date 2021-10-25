package pattrn;

public class pattern1 {

	public static void main(String[] args) {
		int i=0,j=0;
		patternDemo(i,j);
	}

	private static void patternDemo(int i, int j) {
		if(i<5)
		{
			//System.out.println(i + "  "+j);
			
			if(i+j<5)
				System.out.print("*");
			else
				System.out.print(" ");
			if(j<4)
			{
				j++;
			}
			else if(j==4)
			{
				j=0;
				i++;
				System.out.println();
			}
			patternDemo(i, j);
		}
		
		
	}

}
