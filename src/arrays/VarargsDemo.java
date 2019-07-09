package arrays;

public class VarargsDemo {

	public static void main(String[] args) {
		// 7-9-19
		
		VarargsDemo o=new VarargsDemo();
		System.out.println(o.display(1,2,1,5,8,7,9,9,6,3,5,56,56,5,6,5,65,6,5,6,5,6,0,65));

	}
	public int display(int ... k)
	{
		int sum=0;
		
		for(int i:k)
		{
			sum=sum+i;
		}
	return sum;
	}

}
