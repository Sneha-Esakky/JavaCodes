package Array;

import java.util.Scanner;

public class A7 {

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
     int[] res=count(a);
     System.out.println("even:"+res[0]);
     System.out.println("odd:"+res[1]);
	}
	public static int[] count(int[] a)
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		int[] res=new int[2];
		res[0]=even;
		res[1]=odd;
		return res;
		
     
     
	}

}
