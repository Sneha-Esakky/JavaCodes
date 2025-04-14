package Array;

import java.util.Scanner;

public class A14 {

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
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(key==a[j])
			{
				count++;
				break;
				
			}
		}
		if(count==1)
			System.out.println("key element is found");
		else
			System.out.println("key element is not found");
		
	}

}
