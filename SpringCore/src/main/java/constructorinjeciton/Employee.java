package constructorinjeciton;

public class Employee {

	private int id;
	private String name;
	private String mail;

	public Employee(int id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}

	
}
