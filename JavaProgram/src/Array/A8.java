package Array;

import java.util.Scanner;

public class A8 {

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
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	System.out.println("After reversing");	
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
	}

}
