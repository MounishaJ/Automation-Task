package basicjava;

public class ArrayInterviewQu {

	public static void main(String[] args) {
		//7-4-2019
		
			/*	2 4 5
				7 8 9 
				3 0 9 
			*/
				
				int a[][]=new int[3][3];
				a[0][0]=2;
				a[0][1]=4;
				a[0][2]=5;
				a[1][0]=7;
				a[1][1]=8;
				a[1][2]=9;
				a[2][0]=3;
				a[2][1]=0;
				a[2][2]=9;
				
				int mincolumn=0;
				int min=a[0][0];
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						System.out.println(a[i][j]);
						
						if(a[i][j]<min)
						{
							min=a[i][j];
							mincolumn=j;
							System.out.println("min numbr"+min);
						}
					}
				}
				
				int max=a[0][mincolumn];
				int k=0;
				while(k<3)
				{
					if(a[k][mincolumn]>max)
					{
						max=a[k][mincolumn];
					}
				k++;
		}
		System.out.println("maxnumber"+max);

	}

}
