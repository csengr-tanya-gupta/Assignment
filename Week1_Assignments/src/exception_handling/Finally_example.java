package exception_handling;
import java.util.Scanner;

public class Finally_example {
	public static void a() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter an id: ");
			int id = sc.nextInt();
			System.out.println("Enter a name : ");
			String name= sc.next();
			
			//if i use nextLine() instead of next() here then:
			//Step-by-step:

			//1️⃣ nextInt() reads 10
			//2️⃣ The newline (Enter) after 10 is still in the input buffer
			//3️⃣ nextLine() immediately reads that leftover newline
			//4️⃣ So name becomes "" (empty string)
			//5️⃣ Program continues and finishes
			
			
			System.out.println("ID: "+id);
			System.out.println("Name: "+name);
			
			
			
		}
		catch(Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("Inavlid input");
		}
		finally {
			sc.close();
			System.out.println("Resource closed");
		}
	}

}
