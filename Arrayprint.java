
public class Arrayprint {

	public static void main(String[] args) 
	{
		int []a= {1,2,4,5,7,8};
		int i=0;
		printElement(a,i);

	}

	private static void printElement(int[] a, int i) 
	{
		if(i<a.length)
		{
			System.out.println(a[i]);
			printElement(a, ++i);	
		}
		
	}

}
