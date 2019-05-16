package basicjava;

import java.util.Scanner;

public class loop1 {

	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter your table number");	
        int n=sc.nextInt();
        
        //
//        for(int i=1;i<=4;i++)
//        {

        
        System.out.println("enter your opeartion mode");
        	int m=sc.nextInt();
        	for(int i=1;i<=n;i++)
        	{
        	if(m<=1)
        	{
        	    System.out.println("enter valid operation ");
        	}
        	if(m==1)
        	{
        	    System.out.println(" you are selecting opeartion mode 1 ");
        	    System.out.println(n+"*"+i+"="+(n*i));
        	}
        	if(m==2)
        	   {
        	    System.out.println("enter your opeartion mode 2");
        	   }
        	if(m==3)
        		   {
        	    System.out.println("enter your opeartion mode 3");
        		   }
        	if(m==4)
        			 {
        	    System.out.println("enter your opeartion mode 4");
        			  }
      
	   if(m>=5)
	   {
		    System.out.println("Invalid operation");
	   }
	
	}
	}
        	    	
     	 
	
}
