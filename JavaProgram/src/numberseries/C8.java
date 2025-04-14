package numberseries;

import java.util.Scanner;

public class C8 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter one integer value");
		int n=s.nextInt();
		String res= isPerfect(n);
		System.out.println(n+ " is a " +res);
	}
		
		public static String isPerfect(int n)
		{
			int sum=0;
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==n)
				return"Perfect number";
			else
				return"not a perfect number";
			
				

	}

}
