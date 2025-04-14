package numberseries;

import java.util.Scanner;

public class C7 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter one integer value");
		int n= s.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%2==0)
			{
				sum=sum+i;
			}
		}
			if(n==sum)
				System.out.println(n+" is a perfect number");
			else
				System.out.println(n+" is not a pefect number");
			}
		
	
	}


