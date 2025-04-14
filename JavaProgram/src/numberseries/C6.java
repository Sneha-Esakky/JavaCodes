package numberseries;

import java.util.Scanner;

public class C6 {

	public static void main(String[] args) {
		
		    Scanner s=new Scanner(System.in);
		    System.out.println("enter an integer value");
		    int n= s.nextInt();
		    int count=0;
		    for(int i=1;i<=n;i++)
		    {
		    	if(n%i==0)
		    	{
		    		count++;
		    	}
		    }
		    System.out.println(count);
			}

		}

	


