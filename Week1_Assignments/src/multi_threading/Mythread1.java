/**
 * 
 */
package multi_threading;

/**
 * 
 */
public class Mythread1 extends Thread{
	@Override
	public void run() {
		try {
		for (int i=1; i<=5; ++i) {
			Thread.sleep(3000);
			System.out.println("Mythread1: "+i);
			
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
