package strings123;

public class S27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The Quick Brown fox jumps over the lazy dog ";
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		int count=0;
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<ch.length;j++)
				{
				  if(i==ch[j])
				  {
					  count++;
					  break;
				  }
				}
				}
		if(count==26)
			System.out.println("Panagram");
		else
			System.out.println("not an Panagram");

	}

}
