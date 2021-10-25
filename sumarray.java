
public class sumarray {

	public static void main(String[] args) {
		int a[]= {4,5,3,2};
		int sum=0;
		int i=0;
		int total=addaaraay(a,sum,i);
		System.out.println(total);
		

	}

	private static int addaaraay(int[] a, int sum, int i) 
	{
		if(i<a.length)
		{
			sum=sum+a[i];
			//System.out.println(sum);
			return addaaraay(a, sum, ++i);
		}
		
		return sum;
	}

}
