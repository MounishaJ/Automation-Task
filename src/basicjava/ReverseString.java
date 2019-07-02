package basicjava;

public class ReverseString {

	public static void main(String[] args) {
		// 7-2-2019
		
		String arr= "Testing";
		String x="";
		for(int i=arr.length()-1;i>=0;i--)
		{
			x=x+arr.charAt(i);
		}
System.out.println(x);
	}

}
