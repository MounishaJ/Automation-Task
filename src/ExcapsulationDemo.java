
public class ExcapsulationDemo {

	public static void main(String[] args) {
		// 7-9-2019
		
		Student s=new Student();        //Encapsulation=>Binding data at runtime
		s.setEmpId(2608);
		s.setName("MounishaU");

	}

}
class Student
{
	private int EmpId;
	private String name;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		this.EmpId = empId;
		System.out.println(EmpId);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	
	
}