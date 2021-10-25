
public class arrayprinta {

	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		int i=0;
		int j=a.length-1;
		printArray(a,i);
		RevesreArray(a,j);

	}

	private static void RevesreArray(int[] a,int j)
	{
		if(j>=0)
		{
			System.out.print(a[j]);
			RevesreArray(a, --j);
		}
		
	}

	private static void printArray(int[] a, int i)
	{
		if(i<a.length)
		{
			System.out.println(a[i]);
			printArray(a, i+1);
		}
	
		
	}

}
