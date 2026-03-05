package collections_framework_list;

public class ExceptionH {
	public static void exe() {
		int i=10;
		System.out.println("i is "+i);
		int j= 0;
		System.out.println("j is :"+j);
		
		try {
			int k =i/j;
			System.out.println("k is "+k);
			System.out.println("trying ");
		}
		
		catch(ArithmeticException art){
			System.out.println("cant divide by zero! ");
		}
		
		String s= null;
		try{
			System.out.println(s+" "+s.length());
			
		
		}
		catch(NullPointerException npe) {
			System.out.println("cannot perform operations on null");
		}
		
		
	}
}
