package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareStrings {

	public static void Compare() throws IOException
	{
		System.out.println("----------- Check if Strings are Equal or not ---------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first String :");
		String s1 = br.readLine();
		
		System.out.print("Enter the second String :");
		String s2 = br.readLine();
		
		int result = s1.compareTo(s2);
		if (result == 0) {
			System.out.println("The Strings are Equal");
		}else {
			System.out.println("The Strings are not Equal");
		}
	}
	
	public static void ChooseBiggerInLength() throws IOException
	{
		int lenS1,lenS2;
		System.out.println("----------- Check if Strings are Equal or not ---------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first String: ");
		String s1 = br.readLine();
		lenS1 = s1.length();
		
		System.out.print("Enter the second String: ");
		String s2 = br.readLine();
		lenS2 = s2.length();
		
		if (lenS1 == lenS2) {
			System.out.println(s1 +" and " + s2 + " are equal in length");
		}else {
			if (lenS1 > lenS2) {
				System.out.println(s1 +" is greater than " + s2 + " in length");
			} else
			{
				System.out.println(s2 +" is greater than " + s1 + " in length");
			}
		}
	


	}
}
