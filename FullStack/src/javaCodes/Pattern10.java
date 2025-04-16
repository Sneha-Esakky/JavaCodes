package javaCodes;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='A'; i<='E'; i++) {
	    	 for(char j='A'; j<='E'; j++) {
	    		 if(i>=j)
	           System.out.print(j);
	    	 }
			System.out.println();
		}
	}

}
