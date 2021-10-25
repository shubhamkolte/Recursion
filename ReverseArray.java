 
public class ReverseArray {

	public static void main(String[] args)
	{
		int a[]= {3,4,9,6,7};
		int i=a.length-1;
		Reverse(a,i);
		
		

	}

	private static void Reverse(int[] a, int i)
	{
		if(i>=0)
		{
			System.out.print(a[i]);
			Reverse(a, --i);
		}
		
	}

}
