package numberseries;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Physics marks");
		int p=s.nextInt();
		System.out.println("enter chemistry marks");
		int c=s.nextInt();
		System.out.println("enter maths marks");
		int m=s.nextInt();
		System.out.println("enter biology marks");
		int b=s.nextInt();
		if(p>=35 && c>=35 && m>=35 && b>=35)
		{
		 int per = (p+c+m+b)/4;
		  if(per>=85)
		  {
			 System.out.println("passed with distinction");
		  }
		  else if(per>=60)
		  {
			 System.out.println("passed with first class");
		  }
		  else if(per>=50)
		  {
			  System.out.println("passed with second class");
		  }
		  else {
			  System.out.println("just passed");
		  }
		}
		else {
			System.out.println("student has failed");
		}
	}
}