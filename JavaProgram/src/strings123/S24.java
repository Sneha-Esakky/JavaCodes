package strings123;

public class S24 {
//to print unique elements
	public static void main(String[] args) {
    String s="java";
    char ch[]=s.toCharArray();
    boolean b[]=new boolean[ch.length];
    System.out.println("unique alphabets");
    for(int i=0;i<ch.length;i++)
    {
    	if(b[i]==false)
    	{
    		int count=1;
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[j]==ch[i])
    			{
    				count++;
    				b[j]=true;
    			}
    		}
    		if(count==1)
    			System.out.println(ch[i]+" present for "+count);
    	}
    		
    }
    
    
	}

}
