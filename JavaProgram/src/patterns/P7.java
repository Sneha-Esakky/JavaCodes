package patterns;

public class P7 {

	public static void main(String[] args) {
    int n=4;
    char ch ='A';
    for (int i = 0; i < n; i++) {
    	for (int j = 0; j < n; j++) {
    		if(i>=j)
    			System.out.println(ch+" ");
    		else
    			System.out.println(" ");
		}
    }
		ch++;
		System.out.println();
	}
}
	


