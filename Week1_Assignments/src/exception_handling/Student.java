/**
 * 
 */
package exception_handling;

/**
 * 
 */
public class Student {
	int id;
	String name;
	String mailId;
	long contactNumber;
	
	public Student(int id, String name, String mailId, long contactNumber) {
		this.id=id;
		this.contactNumber=contactNumber;
		this.name=name;
		this.mailId=mailId;
	}
	@Override
	public String toString() {
		return "Student [id="+ id +" , name= "+name+" , mail id: "+mailId+" , contactNumber "+contactNumber+" ]";
	}
}
