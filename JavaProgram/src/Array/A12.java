package Array;

import java.util.Arrays;
import java.util.Scanner;

public class A12 {

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
		Arrays.sort(a);
		System.out.println("enter n values from 1 to"+a.length);
		int b=s.nextInt();
		System.out.println(a[b-1]);
	}

}
