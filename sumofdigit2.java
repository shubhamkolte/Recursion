
public class sumofdigit2 {

	public static void main(String[] args) {
		int a[]= {3,4,5,6};
		int i=0;
		int sum=0;
		addArrayElement2(a,i,sum);

	}

	private static void addArrayElement2(int[] a, int i, int sum) 
	{
	if(i<a.length)
	{
		sum=sum+a[i];
		addArrayElement2(a, ++i, sum);
	}
	else
		System.out.println(sum);
		
	}

}
