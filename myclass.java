
public class myclass {

	public static void main(String[] args) 
	{
		int i=0;
		m1(i);

	}

	private static void m1(int i)
	{
		System.out.println("hi");
		if(i<5)
			
			m1(i+1); /// ++i ,i+1 is work i++ is not work its an post increment 
		
	}

}
