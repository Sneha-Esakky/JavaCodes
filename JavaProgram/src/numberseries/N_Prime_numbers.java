package numberseries;

import java.util.Scanner;

public class N_Prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s= new Scanner(System.in);
   System.out.println("enter the m value");
   int m =s.nextInt();
   for (int j=2; j<m; j++)
   {
	   int n=j;
	   int count=0;
	   for (int i=2; i<n; i++) 
	   {
		   if(n%i==0)
		   {
			   count++;
			   break;
		   }
	   }
	   if(count==0 && n!=1)
	   {
		   System.out.println(n);
	   }
   }
   
	}
	
	}


