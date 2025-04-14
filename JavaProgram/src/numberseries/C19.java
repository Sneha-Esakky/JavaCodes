package numberseries;

import java.util.Scanner;

public class C19 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	    System.out.println("enter a integer value");
	    int m= s.nextInt();
	    for(int j=2;j<=m;j++)
	    {
	   // int n=j;
	    int count=0;
	    for(int i=2;i<j;i++)
	    {
	    	if(j%i==0)
	    	{count++;
	    	 break;
	    	}
	    }
	    if(count==0&&j!=1)
	    {
	    	System.out.println(j);
	    }
	   
	}
}
}
	    
	    
	   
	    



