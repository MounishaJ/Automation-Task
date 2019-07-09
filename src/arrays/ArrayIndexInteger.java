package arrays;

public class ArrayIndexInteger {

	public static void main(String[] args) {
		// 3-7-3019
		
	//printing index of the finding(number) value
		int[] a= {4,8,9,0,2,1,6,3,5,7};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
