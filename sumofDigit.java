
public class sumofDigit {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int i=0;
		int sum=0;
		int finalAddition=addarrayElement(a,i,sum);
		System.out.println(finalAddition);

	}

	private static int addarrayElement(int[] a, int i, int sum) 
	{
		if(i<a.length)
		{
			sum=sum+a[i];
			return addarrayElement(a, ++i, sum);
		}
		return sum;
	}

}
