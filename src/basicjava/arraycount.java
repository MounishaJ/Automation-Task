package basicjava;

public class arraycount {

	public static void main(String[] args) {
		// 2-7-2019
		
		int[] arr= {9,7,8,2,5,1,3,6,4,0};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
System.out.println(sum);
	}

}
