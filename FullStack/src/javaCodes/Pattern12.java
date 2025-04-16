package javaCodes;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='A'; i<='D'; i++) {
	    	 for(char j='A'; j<='D'; j++) {
	    		 if(i>=j)
	           System.out.print(j);
	    	 }
			System.out.println();
		}
		
		for(char i='C'; i>='A'; i--) {
			for(char j='A'; j<='C'; j++) {
				if(i>=j)
					System.out.print(j);
			}
			System.out.println();
		}
	}

}
