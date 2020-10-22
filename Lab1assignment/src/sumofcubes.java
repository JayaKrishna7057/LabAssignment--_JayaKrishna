/**
  Author : Jayakrishna
  date : 22/10/2020
  desc : sumofcubes
  */
import java.util.*;

	public class sumofcubes {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner sc=new Scanner(System.in);
			 sumofcubes p=new sumofcubes();
		        System.out.println("enter n value");
		        int n=sc.nextInt();
		        int result=p.sumofcubes(n);
		        System.out.println(result);
		}
	       int sumofcubes(int n)
	       {
	    	   int sum=0;
	    	   for(int i=1;i<=n;i++)
	    	   {
	    		  sum=sum+(i*i*i);
	    		  
	    	   }
	    	   return sum;
	       }

	}

