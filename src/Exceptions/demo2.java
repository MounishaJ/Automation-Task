package Exceptions;

public class demo2 {
	public static void main(String[]arg)
	{
		try
		{
			int[]a=new int[9];
			System.out.println(a[20]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Iam finally block");
		}
	}

}
