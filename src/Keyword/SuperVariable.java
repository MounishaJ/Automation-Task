package Keyword;

public class SuperVariable extends SuperVariable1 {
	
	String name="Super variable1";
	public static void main(String[] args) {
		// 7-5-2019
		
		
		SuperVariable s=new SuperVariable();
		
		s.getdata();
		
		}
public void getdata()
{
	System.out.println(name);
	System.out.println(super.name);
}
}