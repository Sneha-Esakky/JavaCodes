package Array;

import java.util.Arrays;
import java.util.Scanner;

public class A9 {

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
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
