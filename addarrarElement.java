
public class addarrarElement {

	public static void main(String[] args) {
		int a[]= {3,5,6,7};
		int i=0;
		int result=addArrayelement(a,i);
		System.out.println(result);
	}

	public static int addArrayelement(int[] a, int i) {
		if(i<a.length)
		{
			int sum=addArrayelement(a, i+1);
			return a[i]+sum;
		}
		return 0;
	}

}
