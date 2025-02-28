package JavaconceptsExamples;
public class Encapsulation {
	private int Ganesh_Age;
	private String name;
	// getters, setters for Student_Id and name fields.
	public int getage() {
		return Ganesh_Age;
	}
	public void setage(int Age) {
		this.Ganesh_Age = Age;
	}
	public String getname() {
		return name;
	}
	public void setname(String s_name) {
		this.name = s_name;
	}
	public static void main(String[] args) {
		// create an object of Student class
		Encapsulation obj = new Encapsulation();
		// set fields values using setter methods
		obj.setage(27);
		obj.setname("Ganesh");
		// print values using getter methods
		System.out.println("His Age is :" + obj.getage() + " and:"
				+ " Name is :" + obj.getname());
	}

}
