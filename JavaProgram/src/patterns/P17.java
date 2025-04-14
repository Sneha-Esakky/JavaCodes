package patterns;

public class P17 {

	public static void main(String[] args) {
     int n=27;
     int space =n/2;
     int star=1;
     
     for (int i=1; i<=n; i++) {
    	 for(int j=0;j<=space;j++)
    	 {
    		System.out.print("  "); 
    	 }
		for(int j=1;j<=star;j++)
		{
			System.out.print("?``	111q																																																																																						`	q ");
		}
		System.out.println();
		if(i<=n/2)
		{
			space--;
			star+=2;
		}
		else
		{
			space++;
			star-=2;
		}
     }
	}

}
