/**
  Author : Jayakrishna
  date : 22/10/2020
  desc : SumOfSquares
  */
import java.util.Scanner;
import java.lang.Math;
public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        SumOfSquares s=new SumOfSquares();
        System.out.println("enter n value");
        int n=sc.nextInt();
        int result=s.calculateDifference(n);
        System.out.println(result);
	}
    int calculateDifference(int n)
    {
    	int sum=0,v=0;
		int k=0;
    	for(int i=1;i<=n;i++) 
    	{
    	   k=k+(int)Math.pow(i, 2);
    	   v=v+i;
    	}
    	
    	 sum=k-(int)Math.pow(v, 2);
    	return sum;
	}

}
