package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class User {

	public static void main(String[] args) {
    ArrayList<Laptop> a= new ArrayList<>();
    a.add(new Laptop(102,70000.0,"Hp"));
    a.add(new Laptop(103,75000.0,"Dell"));
    a.add(new Laptop(104,50000.0,"Acer"));
    a.add(new Laptop(107,80000.0,"Lenovo")); 
    a.add(new Laptop(106,45000.0,"Asus"));
//   for (int i = 0; i < a.size(); i++) {
//    Laptop l= a.get(i);
//   }
//    Iterator<Laptop> i= a.iterator();
//    while(i.hasNext())
//    {
//    	Laptop b = i.next();
//    	if(b.price>50000.0)
//    	{
//    	 i.remove();
//    	}
// }
//    for(Laptop l : a)
//    {
//    	if(l.price>50000.0)
//    	{
//    	System.out.println("");
//    	}
//    }
    
    ListIterator<Laptop> b=a.listIterator();
    while(b.hasNext())
    { 
    	Laptop c=b.next();
    	if(c.price<50000.0)
    	{
    		a.remove(c);
    	}
    System.out.println(c);
    }
    
    
    System.out.println(a);
    
	}

}
