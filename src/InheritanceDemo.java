class Calculator
{
	public int add(int u,int m)
	{
	return u+m;	
	}
}
class CalAdv extends Calculator   //single inheritance
{
	public int sub(int u,int m)
	{
		return u-m;
	}
}
class CalVeryAdv extends CalAdv   //multi level inhertance
{
	public int mul(int u,int m)
	{
		return u*m;
	}
}

  
public class InheritanceDemo {

	public static void main(String[] args) {
		// 7-9-2019
		
CalVeryAdv obj=new CalVeryAdv();
Calculator obj1=new CalAdv();
System.out.println(obj1.add(8,9));
System.out.println(obj.add(9,9));
System.out.println(obj.sub(989879,6546));
System.out.println(obj.mul(57,89));

	}

}
