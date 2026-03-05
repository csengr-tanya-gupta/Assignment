package collections_framework_list;
import java.util.HashSet;
import java.util.*;


public class HashSetUse {
	public static void execution() {
		HashSet<Character> hs1 = new HashSet<Character>();
		hs1.add('a'); hs1.add('I'); hs1.add('*');
		hs1.add('3'); hs1.add('W');
		System.out.println(hs1);
		
		HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();
		System.out.println(hs2);
		System.out.println(hs1.equals(hs2));
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		
		
		
		HashSet hs = new HashSet();
		hs.add(null);
		hs.add(null);
		hs.add(null);
		
		hs.add(10);
		hs.add(true);
		hs.add('j');
		hs.add("java");
		hs.add(12.34);
		hs.add(new Prodcut(1, "Apsara", "Pen", 29.99));
		System.out.println(hs);
		
		
		HashSet<Character> hs3 = new HashSet<Character>();
		hs3.add('A'); hs3.add('z'); hs3.add('+'); hs3.add('4');
		hs3.add('Z'); hs3.add('a');
		
		Iterator<Character> iterator = hs3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		hs3.remove('+');
		System.out.println(hs3);
	
	}

}
