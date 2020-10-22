/**
  Author : Jayakrishna
  date : 22/10/2020
  desc : Power
  */
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Power p=new Power();
        System.out.println("enter n value");
        int n=sc.nextInt();
        boolean result=p.checkNumber(n);
        System.out.println(result);
	}
    boolean checkNumber(int n)
    {
    	int l=0;
    	for(int i=0;i<n;i++) {
    	if(n==(int)Math.pow(2,i))
    	{
    		l=1;
    	}
    	}
    	if(l==1)
    	return true;
    	else return false;
    }
}
