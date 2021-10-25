
public class facto {
	static int factorial=0;
	public static void main(String[] args)
	{
		int num=4;
		int fact=1;
		int cnt=1;
		
		System.out.println("factorial :- "+factorial(num,fact,cnt));

	}

	private static int factorial(int num, int fact,int cnt)
	{
		if(cnt<=num)
		{
			fact=fact*cnt;
			return factorial(num, fact,++cnt);
		}
			
		return fact;
		
		
		
	}

}
