package patterns;

public class P12 {

	public static void main(String[] args) {
		int n=3; 
	    for (int i = 1; i <= n; i++) {
	    	{  char ch='a';
	    		for (int j=1; j<=n-i; j++)
	    		{
					System.out.print("  ");
				}
	    		for (int j = 1; j <= 2*i-1; j++) 
	    		{
					System.out.print(ch+++" ");
				}
	    		System.out.println();
	    	}
	    	
		}
	}

}
