/**
 * 
 */
package collections_framework_list;

/**
 * 
 */
public class Student {
	private int id;
	private String name;
	private String mailId;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String mailId) {
		this.id = id;
		this.name = name;
		this.mailId =  mailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("NAme: "+name);
		System.out.println("Mail: "+mailId);
		System.out.println("-------------------");
		
	}
	

}
