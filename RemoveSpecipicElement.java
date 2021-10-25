import java.util.Arrays;

public class RemoveSpecipicElement {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,6};
		int key=6;
		int i=0;
		int cnt=0;
		int resutl=removcount(a,key,i,cnt);
		
		int b[]=new int[a.length-resutl];
		//
		int ind=0;
		i=0;
		Remove(a,b,key,ind,i);
		System.out.println(Arrays.toString(b));

	}

	private static void Remove(int[] a, int[] b, int key,int ind,int  i)
	{
		if(i<a.length)
		{
			if(key!=a[i])
			{
				b[ind++]=a[i];
			}
			Remove(a, b, key,ind, i+1);
		}
		
	}

	private static int removcount(int[] a, int key, int i,int cnt)
	{
		if(i<a.length)
		{
			if(key==a[i])
			{
				cnt++;
				
			}
			return removcount(a, key, ++i, cnt);
		}
		return cnt;
		
	}

}
