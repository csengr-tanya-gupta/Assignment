package collections_framework_list;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;


public class TryHashMap {
		public static void r() {
			HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
			hm.put(1, 11.11) ; hm.put(-2, -22.22); hm.put(3, 33.33);
			hm.put(-4, -44.44);  hm.put(5,5.5); hm.put(-6, -66.66);
			System.out.println(hm);
			
			HashMap<Integer, Double> hm2 = (HashMap<Integer, Double>) hm.clone();
			System.out.println(hm2);
			
			System.out.println(hm.equals(hm2));
			
			System.out.println(hm.hashCode());
			System.out.println(hm2.hashCode());
			
			HashMap hm3 = new HashMap();
			hm3.put(1, 12.34);
			hm3.put('j', "java");
			hm3.put(12.34, 10);
			
			
			
			HashMap<Integer, Double> hask= new HashMap<Integer, Double>();
			hask.put(1,  11.11);
			hask.put(-2, -22.22);
			hask.put(3, 33.33);
			hask.put(-4, -44.44);
			Set<Integer> keys = hask.keySet();
			System.out.println(keys);
			Collection <Double> values = hask.values();
			System.out.println(values);
			System.out.println(hask);
			
			
			
		}

	


}
