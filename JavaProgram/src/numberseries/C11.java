package numberseries;

import java.util.Scanner;

public class C11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter an integer value");
		int n= s.nextInt();
		int temp=n;
		int sum=0;
		int prod=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
      if(prod==sum)
      {
    	  System.out.println(temp+" is a spy number");
      }
      else
      {
    	  System.out.println(temp+" is not a spy number");
      }


}
}
