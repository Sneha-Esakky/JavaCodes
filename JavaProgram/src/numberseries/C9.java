package numberseries;

public class C9 {

	public static void main(String[] args){ 
		for(int j=1;j<=100;j++)
		{
			int n=j;
			int sum=0;
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(n==sum)
				System.out.println(n);
	
			
		}
 
	}

}
