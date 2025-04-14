package patterns;

public class P1 {

	public static void main(String[] args) {
    int n = 4;
    int number = 1;
    char letter = 'a';
    for (int i = 0; i < n; i++) {
    	for (int j = 0; j < i; j++) {
    		System.out.print("  ");
    	}
    	if (i % 2 == 0) {
    		// For even lines, print numbers
    		for (int j = 0; j < n - i; j++) {
    			System.out.print(number + " ");
    			number++;
    		}
    	} else {
    		// For odd lines, print letters
    		for (int j = 0; j < n - i; j++) {
    			System.out.print(letter + " ");
    			letter++;
    		}
    	}
		           
    	System.out.println();
		        }
		    }
	}


