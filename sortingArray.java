import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		int a[]= {2,3,9,1,5};
		int i=0;
		int j=0;
		sortingAray(a,i,j);
		System.out.println(Arrays.toString(a ));

	}

	private static void sortingAray(int[] a, int i,int j)
	{
		if(i<a.length)
		{ 
			if(j<a.length-1)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
			
			else if(j==a.length-1)
			{
				j=0;
				i++;
			}
			sortingAray(a, i, j);
		}
		
	}

}
