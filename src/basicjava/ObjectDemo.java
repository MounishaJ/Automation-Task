package basicjava;

public class ObjectDemo {

	public static void main(String[] args) {
		// 7-8-2019
		
		Demo d=new Demo();
		d.num1=546545;
		d.num2=454545;
		d.perform();
		System.out.println(d.result);
		System.out.println(d.result1);
	}

}
class Demo
{
	int num1;
	int num2;
	int result,result1;
	void perform()
	{
		result=num1+num2;
		result1=result-num1;
	}
}
