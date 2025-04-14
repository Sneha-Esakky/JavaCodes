package Array;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("enter the"+n+"elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
