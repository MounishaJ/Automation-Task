package arrays;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		// 7-9-2019
		
		int a[][]= {{1,2,3,4,5},{2,4,6},{7,8,9,0,1,2},{1,3,5,7,} };
		for(short i=0;i<a.length;i++)
		{
			for(short j=0;j<a[i].length;j++)
	{
				System.out.print(" "+a[i][j]);
			}System.out.println();
	}
	

	}

}
