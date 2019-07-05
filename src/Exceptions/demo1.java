package Exceptions;

public class demo1 {

	public static void main(String[] arg)
	{
	try
	{
	int x=90,y=209,z=0;
	int m=z/x;
	int n=y/z;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Finally block executed");
	}
}
}