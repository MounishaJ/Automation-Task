package arrays;

public class ArrayStrings1 {

	public static void main(String[] args) {
		// 3-7-2019
		
		char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='m'||a[i]=='v')
			{
				System.out.println(i);
			}
		}
	}

}
