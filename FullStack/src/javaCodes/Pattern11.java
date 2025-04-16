package javaCodes;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='A'; i<='D'; i++) {
	    	 for(char j='A'; j<='D'; j++) {
	    		 if(i>=j)
	           System.out.print(i);
	    	 }
			System.out.println();
		}
		
		for(char i='C'; i>='A'; i--) {
			for(char j='C'; j>='A'; j--) {
				if(i>=j)
					System.out.print(i);
			}
			System.out.println();
		}

	}

}
