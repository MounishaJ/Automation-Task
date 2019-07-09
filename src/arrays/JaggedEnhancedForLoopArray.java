package arrays;

public class JaggedEnhancedForLoopArray {

	public static void main() {
		// 7-9-2019
		
		int a[][]= {{1,2,3,4,5},{2,4,6},{7,8,9,0,1,2},{1,3,5,7,} };
		for(int u[]:a)
		{
			for(int m: u)
			{ 
				System.out.println(m);
				
			}
		}

	}
}
