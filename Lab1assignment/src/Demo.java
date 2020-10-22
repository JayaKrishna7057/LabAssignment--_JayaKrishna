/**
  Author : Jayakrishna
  date : 22/10/2020
  desc : Demo
  */
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo();
        System.out.println("enter n value");
        int n=sc.nextInt();
        int result=d.calculateSum(n);
        System.out.println(result);
	}
    int calculateSum(int n)
    {
    	int sum=0;
    	for(int i=1;i<=n;i++) 
    	{
    	if(i%3==0 || i%5==0)
        	sum=sum+i;
        	}
        	return sum;
        }
    }
