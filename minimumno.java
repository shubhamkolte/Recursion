
public class minimumno {

	public static void main(String[] args) {
		int []a= {3,5,34,79,1	};
		int min=Integer.MAX_VALUE;
		int i=0;
		printmax(a,i,min);
		
	}

	private static void printmax(int[] a, int i, int min) {
		if(i<a.length)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			printmax(a,i+1,min);
		}
		else
			System.out.println(min);
	}

}
