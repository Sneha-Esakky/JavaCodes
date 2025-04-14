package patterns;

public class P2 {

	public static void main(String[] args) {
		int n=4;
		char ch='a'; 
		for (int i=0 ;i<n; i++) {
			System.out.print(ch+++ " ");
		}
		        System.out.println();

		        // Second line: 1 2 3
		        for (int i = 1; i <= 3; i++) {
		            System.out.print(i + " ");
		        }
		        System.out.println();

		        // Third line: a b
		        for (int i=0; i<=n; ch++) {
		            System.out.print(ch + " ");
		        }
		        System.out.println();

		        // Fourth line: 1
		        System.out.println(1);
		    }
	}


