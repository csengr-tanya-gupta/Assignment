/**
 * 
 */
package multi_threading;

/**
 * 
 */
public class JavaApp {
	public static void execution(){
		
		//here main method is getting first prefernce
		
			try {
			for (int i=1; i<=5; ++i) {
				Thread.sleep(3000);
				System.out.println("pre Defined Thread "+i);
				
			}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		
		
		Mythread1 m1 = new Mythread1();
		m1.start();
		
		Mythread2 m2 = new Mythread2();
		//we will now associate user defined thread with Compiler defined thread
		Thread thread = new Thread(m2);
		thread.start();
		
		
	}
}
