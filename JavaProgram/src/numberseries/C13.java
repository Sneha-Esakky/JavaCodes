package numberseries;

import java.util.Scanner;

public class C13 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter an integer value");
	int n = s.nextInt();
	int sum=0;
	int sq= n*n;
	while(sq>0)
	{
    int res= sq%10;
    sum=sum+res;
    sq=sq/10;
   
}
	if(n==sum)
		System.out.println(n+" is a neon number");
	else
		System.out.println(n+" is not a neon number");
	}
}
