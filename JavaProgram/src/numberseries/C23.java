package numberseries;

public class C23 {

	public static void main(String[] args) {
     int a=0;
     int b=1;
     System.out.println(a+""+b+"");
     for(int i=1;i<=8;i++)
     {
    	 int sum=a+b;
    	 System.out.println(sum);
    	 a=b;
    	 b=sum;
     }
	}

}
