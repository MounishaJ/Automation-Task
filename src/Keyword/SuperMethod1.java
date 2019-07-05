package Keyword;

public class SuperMethod1 extends SuperMethod {

	public static void main(String[] args) {
		// 7-5-2019
SuperMethod1 s=new SuperMethod1();
s.getData();

		
	}
	public void getData()
	{
		super.getData();
		System.out.println("Iam Child method");
	}
}
