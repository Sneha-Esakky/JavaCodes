package Array;

import java.util.Scanner;

public class A13 {

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
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>a[i])
			{
				count++;
			}
		}
		
	}

}
