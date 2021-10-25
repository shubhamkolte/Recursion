
public class maxnumber {

	public static void main(String[] args)
	{
		int []a= {3,5,34,79};
		int max=Integer.MIN_VALUE;
		int i=0;
		printmax(a,i,max);
		
	}

	private static void printmax(int[] a, int i, int max) {
		if(i<a.length)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			printmax(a,i+1,max);
		}
		else
			System.out.println(max);
	}

}
