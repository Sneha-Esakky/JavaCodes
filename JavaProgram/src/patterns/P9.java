package patterns;

public class P9 {

	public static void main(String[] args) {
		int n=3; int a=1;
	    for (int i = 1; i <= n; i++) {
	    	{
	    		for (int j=1; j<=n-i; j++)
	    		{
					System.out.print("  ");
				}
	    		for (int j = 1; j<=2*i-1; j++) 
	    		{
					System.out.print(a+++" ");
				}
	    		System.out.println();
	    	}
	    	
		}
	}

}
