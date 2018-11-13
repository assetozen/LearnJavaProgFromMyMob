package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swapping {

	public static void SwapUsingTwoVariables() throws IOException
	{
		int a,b;
	
		System.out.println(" ---------- Swap Two numbers --------- ");
		System.out.print("Enter the first number a = ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		a = Integer.parseInt(s1);
	
		System.out.print("Enter the second number b = ");
		String s2 = br.readLine();
		b = Integer.parseInt(s2);
		
		b = a + b;
		a = b - a;
		b = b - a;
		
		System.out.println("After swapping a = " + a + " and b = "+ b);
		
	}
	
	
	public static void SwapUsingThreeVariables() throws IOException
	{
		int a,b,temp;
		System.out.println(" ---------- Swap Two numbers using Three variables --------- ");
		System.out.print("Enter the first number a = ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		a = Integer.parseInt(s1);
		System.out.print("Enter the second number b = ");
		String s2 = br.readLine();
		b = Integer.parseInt(s2);
		temp = a;
		a = b;
		b = a;
		System.out.println("After swapping a = " + a + " and b = "+ b);
		
	}
	
	
}
