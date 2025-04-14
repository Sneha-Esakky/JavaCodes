package Array;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter product size");
     int n =s.nextInt();
     double a[]= new double[n];
     System.out.println("enter"+n+"Prices of the product");
     for(int i=0;i<a.length;i++)
     {
    	 a[i]=s.nextDouble();
     }
     double sum=0.0;
     for(int i=0;i<a.length;i++)
     {
    	 sum=sum+a[i];
     }
     double avg=sum/n;
     System.out.println(avg);
	}

}
