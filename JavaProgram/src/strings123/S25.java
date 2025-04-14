package strings123;

import java.util.Scanner;

public class S25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string S1");
		String s1= sc.nextLine();
		System.out.println("enter String s2");
		String s2=sc.nextLine();
		System.out.println("before Swapping");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After Swapping");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);

	}

}
