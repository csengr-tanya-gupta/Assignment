/**
 * 
 */
package exception_handling;
import java.util.ArrayList;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		try {
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 1; i<=5; ++i) {
				al.add(i);
			}
			for (int i =0; i<al.size(); ++i) {
				System.out.println(al.get(i));
			}
			int[] array = new int[5];
			int data = 1;
			for (int i=0; i<array.length;++i) {
				array[i]=data;
				data++;
			}
			
			String string ="java";
			for(int i=0; i<=string.length(); ++i) {
				System.out.println(string.charAt(i));
			}
		}
		
		catch(Throwable throwable) {
			System.out.println(throwable.getMessage());
			System.out.println(throwable.toString());
			System.out.println();
			throwable.printStackTrace();
			System.out.println("Exception Handled");
		}
	}

}
