package Array;

import java.util.Arrays;
import java.util.Scanner;

public class A15 {

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
		System.out.println("enter the key element");
		int key=s.nextInt();
		Arrays.sort(a);
		int low=0;
		int high =a.length-1;
		int count=0;
		while(low<=high)
		{
			int mid=high+low/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key>a[mid])
			{
				low=mid+1;
			}
			else
				high=mid-1;
		}
		if(count==1)
			System.out.println("key element is found");
		else
			System.out.println("key element is not found");
	}

}
