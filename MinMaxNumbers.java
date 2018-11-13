package programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMaxNumbers {

	public static void MinNumber() 
	{
		System.out.println("Enter 5 numbers to get the minimum of them: ");
		int[] a = new int[5];
		int min= 0;
		String s = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i++) {
			try { s = br.readLine();} 
			catch (IOException e) { e.printStackTrace();
			}
			a[i] = Integer.parseInt(s);
		}
		
		System.out.print("The numbers you entered are: [");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
		
		for (int i = 0; i < 5; i++) {
			if (a[i] < a[min]) {
				min = i;
			}
		}
		
		System.out.println("The minimum number in the given array of numbers is: " + a[min]);
		
	}
	
	public static void MaxNumber()
	{
		System.out.println("Enter the 5 numbers to get the maximum of them: ");
		int[] a = new int[5];
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i++) {
			try {
				String s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		for (int i = 0; i < 5; i++) {
			
			
			if (a[i]> a[max]) {
				max = i;
			}
		}
		
	}
}
