package collections_framework_list;

public class Prodcut {
	
	int id;
	String brand;
	String name;
	double price;
	
	public Prodcut(int id, String brand, String name, double price) {
		this.id = id;
		this.brand= brand;
		this.name= name;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return "Product [id =" +id +"data is :"+ brand + name+ price+"]";
	}
}
