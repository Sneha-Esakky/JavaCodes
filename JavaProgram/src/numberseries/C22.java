package numberseries;

import java.util.Scanner;

public class C22 {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter an integer value");
     int n= s.nextInt();
     int count=0;
     int sum=0;
     int temp=n;
     int m=n;
     while(n>0)
     {
    	n=n/10;
    	count++;
     }
     while(temp>0)
     {
    	 int x= temp%10;
    	 int prod=1;
    	 for(int i=1;i<=count;i++)
    	 {
    		 prod=prod*x;
    	 }
    	 sum=sum+prod;
    	 temp=temp/10;
     }
     if (m==sum) {
    	 System.out.println(m+" is an Armstrong number");	
	} else {
		System.out.println(m+" is not an Armstrong number");       
	}
	}

}
