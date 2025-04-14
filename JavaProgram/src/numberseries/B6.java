package numberseries;

import java.util.Scanner;

public class B6 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in)   ;
     System.out.println("enter an integer value");
     int n= s.nextInt();
     for(int i=1;i<=n;i++)
     {
    	  n=i;
    	 int sum=0;
    	 int prod=1;
    	 int temp=n;
    	 while(n>0)
    	 {
    		 int res=n%10;
    		 sum=sum+res;
    		 prod=prod*res;
    		 n=n/10;
    	 }
    	 if(prod==sum)
    		 System.out.println(temp+" is a Spy number");
    	 
     }
	}

}
