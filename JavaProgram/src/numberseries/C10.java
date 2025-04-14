package numberseries;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	   System.out.println("enter an integer value");
	   int n= s.nextInt();
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		   sum=sum+i;
	   }
	   System.out.println(sum);
		}
	}


