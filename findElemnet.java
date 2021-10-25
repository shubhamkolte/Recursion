
public class findElemnet {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,7};
		int i=0;
		int num=20;
		findelement(a,i,num);

	}

	private static void findelement(int[] a, int i,int num)
	{
		if(a.length>i)
		{
			if(a[i]==num)
				System.out.println("found at " +i);
			else
				findelement(a,i+1,num);
		}
		else
			System.out.println("not found");
		
	}

}
