package demo;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no. :");
		
		int a  = sc.nextInt();
		
		System.out.println("Enter second no. :");
		
		int b = sc.nextInt();
		
		System.out.println("Addition :" + Maths.add(a,b));
		sc.close();
		
	}

}
