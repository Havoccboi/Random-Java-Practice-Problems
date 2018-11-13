import java.util.*;
import java.io.*;
import java.lang.*;

class Fibonacci {
	
	
	public static void main(String[] args) {
		System.out.println("Enter the Nth term");
		Scanner var = new Scanner(System.in);
		int x = var.nextInt();
		fibonacciSeries(x);
		
		
	}
	
	
	 static void fibonacciSeries(int x)
	{
		int result=0;
		
		int fib1=0;
		int fib2=1;
		
		for(int i=1;i<x;i++)
			
		{
			result = fib1 + fib2;
			fib2 = fib1;
			fib1= result;
			
		}
		System.out.println(result);
		
	}

}
