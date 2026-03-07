/**
 * 
 */
package multi_threading;

/**
 * 
 */
public class Mythread2 implements Runnable  {
	@Override
	public void run() {
		try {
		for (int i=1; i<=5; ++i) {
			Thread.sleep(3000);
			System.out.println("User Defined Thread "+i);
			
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
