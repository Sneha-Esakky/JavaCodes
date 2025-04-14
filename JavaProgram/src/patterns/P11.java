package patterns;

public class P11 {

	public static void main(String[] args) {
		int n=4; 
	    for (int i = 1; i <= n; i++) {
	    	{  int a=1;
	    		for (int j=1; j<=n-i; j++)
	    		{
					System.out.print("  ");
				}
	    		for (int j = 1; j <= 2*i-1; j++) 
	    		{
					System.out.print(a%2+" ");
				    a++;
				}
	    		System.out.println();
	    	}
	    	
		}
	}

}
