import java.util.function.Supplier;


class Employee
{
	int id;
	String name;
	public Employee() {
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Employee> obj= Employee::new;
		
		
	}

}
