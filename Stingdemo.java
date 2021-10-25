import java.util.Arrays;

public class Stingdemo {

	public static void main(String[] args) {
		String s1="123 456";
		char []aa=s1.toCharArray();
	
		
		for (int i = 1; i <aa.length; i++)
		{
			for (int j = i+1; j < aa.length-1; j++) 
			{
				
				if(aa[j+1]<aa[j])
				{
					char temp=aa[j];
					aa[j]=aa[j+1];
					aa[j+1]=temp;
					System.out.println(temp);
					i=3;
					
				}
				
			}
	
		}
		System.out.println(Arrays.toString(aa));

	}

}
