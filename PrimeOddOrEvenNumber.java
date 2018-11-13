package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOddOrEvenNumber {

	public static void CheckOddOrEven() 
	{
		int num = EnterNumber();	
		
		if (num%2 != 0) {
			System.out.println(num + " is an odd number");
		} else {
			System.out.println(num + " is an even number");
		}
	}
	
	
	public static void PrimeNumberOrNot()
	{
		int i;
		int num = EnterNumber();
		for (i = 2; i < num; i++) {
			if (num%i == 0) {
				break;
			}
		}
		if (num == i) {
			System.out.println(num +" is a prime number");	
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
	}
	
	
	public static int EnterNumber()
	{
		String s  = null;
		System.out.println("Enter number to check Even or Prime: ");	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		int num = Integer.parseInt(s);
		return num;
	}
}
