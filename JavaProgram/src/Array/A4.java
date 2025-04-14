package Array;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=s.nextInt();
    int a[]= new int[n];
    System.out.println("enter"+n+"values");
    for(int i=0;i<a.length;i++)
    {
   	 a[i]=s.nextInt();
   	 
    }
    int small=a[0];
    for(int i=0;i<a.length;i++)
    {
   	 if(a[i]<small)
   	 {
   		small=a[i]; 
   	 }
    }
   System.out.println(small);		 
	}


	}

