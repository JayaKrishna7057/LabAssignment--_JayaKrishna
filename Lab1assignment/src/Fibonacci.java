/**
  Author : Jayakrishna
  date : 22/10/2020
  desc : Fibonacci
  */
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fibonacci p = new Fibonacci();
		System.out.println("enter n value");
		int n = sc.nextInt();
		int result = p.Fib(n);
		System.out.println(result);
	}
	int Fib(int n) {
		int sum = 0;
		int a = 1, b = 1, c = 0;
		System.out.print(a + "  " + b + "  ");
		for (int i = 0; i <n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + "  ");
		}
		return c;
	}
}
