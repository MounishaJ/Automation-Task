package basicjava;

public class Constructor1 {

	public static void main(String[] args) {
		// 7-5-2019
		
		Constructor1 obj=new Constructor1();
		Constructor1 obj1=new Constructor1("java");

	}

	public Constructor1()
	{
		System.out.println("iam constructor");
	}
	public Constructor1(String s)
	{
		System.out.println("iam parameterized constructor1 "+s);
	}
//you can passs number of argumenets into constructor but constructor will not return anything
	
}
