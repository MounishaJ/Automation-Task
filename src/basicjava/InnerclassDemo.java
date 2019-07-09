package basicjava;

class Outer
{
	int x=9;
	public void show()
	{
		System.out.println("Outer classs method");
	}
	class Inner
	{
		public void display()
		{
			System.out.println("Inner classs method");
		}	
	}
}

public class InnerclassDemo {

	public static void main(String[] args) {
		// 7-9-2019


		Outer obj= new Outer();
		obj.show();
		Outer.Inner obj1=obj.new Inner();    //inner class object 
		obj1.display();
	}

}
