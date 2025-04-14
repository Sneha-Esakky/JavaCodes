package strings123;

import java.util.Scanner;

public class S26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s= sc.nextLine();
    String out="";
    String out1="";
    String out2="";
    String out3="";
    for(int i=0;i<s.length();i++)
    {
    	char ch=s.charAt(i);
    	out=out+ch;
    	System.out.println(out);
    }
    for(int j=out.length()-1;j>0;j--)
    {
    	char c=s.charAt(j);
    	out1=out1+c;
    	System.out.println(out1);
    }
    for(int k=out1.length()-1;k>0;k--)
    {	
        char b=s.charAt(k);
        out2=out2+b;
        System.out.println(out2);
        		
	}
    for(int m=out2.length()-1;m>0;m--)
    {
    	char d=s.charAt(m);
         out3=out3+d;
         System.out.println(out3);
    	
    	
    }

}
}
