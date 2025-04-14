package strings123;

public class S10 {

	public static void main(String[] args) {
    String s="Java Programming Sel";
    String a="Sel";
   int index= s.indexOf(a);
   if(index==-1)
	   System.out.println(" not found");
   else
	   System.out.println("found "+a+" at index "+index);
    
	}

}
