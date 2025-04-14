package Array;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the size");
     int n=s.nextInt();
     int a[]=new int[n];
     System.out.println("enter"+n+"values");
     for(int i=0;i<a.length;i++)
     {
    	 a[i]=s.nextInt();
    	 
     }
     int large=a[0];
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]>large)
    	 {
    		large=a[i]; 
    	 }
     }
    System.out.println(large);		 
	}

}
