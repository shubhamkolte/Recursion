import java.util.Arrays;

public class RverseArrayElemet {
	static int i=0;
	static int j=0;
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		 int j=a.length-1;
		ReverseArray(a,j);
		//System.out.println(Arrays.toString(a));
		print(a);
	}

	private static void print(int[] a)
	{
		
		if(j<a.length)
		{
			System.out.print(a[j++]+" ");
			print(a);
		}
		
	}

	private static void ReverseArray(int[] a,int j) 
	{
		if(i<a.length)
		{
			if(j>0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				ReverseArray(a,--j);
			} 
			
		}
		
		
	}

}
