package strings123;

public class Frequencyofchar {

	public static void main(String[] args) {
		String s= "Java";
     char ch[]=s.toCharArray();
     System.out.println("Frequency of all characters in a string");
     for(int i=0;i<ch.length;i++)
     {
    	 int count=1;
    	 for(int j=i+1;j<ch.length;j++)
    	 {
    		 if(ch[i]==ch[j])
    		 {
    			count++;
    		 }
    	 }
     System.out.println(ch[i]+" Present for " +count+" times ");
     }
     
	}

}
