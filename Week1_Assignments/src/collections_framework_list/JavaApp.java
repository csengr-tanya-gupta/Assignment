/**
 * 
 */
package collections_framework_list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/**
 * 
 */
public class JavaApp {
	public static void execution() {
	
	ArrayList<Integer> al1= new ArrayList<Integer>();
	al1.add(-1); al1.add(2);al1.add(3);al1.add(-4);al1.add(5);
	
	ArrayList<Integer> al2= (ArrayList<Integer>)al1.clone();
	System.out.println(al1);
	System.out.println(al2);
	System.out.println(al1.hashCode());
	System.out.println(al2.hashCode());
	System.out.println(al1.equals(al2));
	
	
	
	ArrayList al = new ArrayList();
	al.add(10); al.add(true); 
	al.add(null);
	al.add('j');
	al.add("java");
	al.add("java");
	
	al.add(new Prodcut(1, "apsara", "Pencil", 29.99));
	System.out.println(al);
	
	
	System.out.println(al1);
	
	
	
	Iterator<Integer> iterator = al1.iterator();
	System.out.println("Forward ");
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	ListIterator<Integer> li = al1.listIterator(5);
	System.out.println("Backward");
	while (li.hasPrevious()) {
		System.out.println(li.previous());
	}
	
	al1.add(2, 33);
	al1.addFirst(111);
	al1.addLast(777);
	
	al1.set(2, 33);
	al1.remove(3);
	System.out.println(al1);
}
	

}
