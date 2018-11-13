package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AscendingDescendingSorting {

	public static void SortAscendingly() throws IOException {
		int[] a = new int[5];
		int i, j, temp;

		System.out.println("Enter 5 numbers: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (i = 0; i < 5; i++) {
			String s = br.readLine();
			a[i] = Integer.parseInt(s);
		}

		System.out.println("The Ascending order of the numbers you entered is: ");
		for (i = 0; i < 5; i++) {
			for (j = i + 1; j < 5; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}

	}

	public static void SortDescendingly() throws IOException {
		int[] a = new int[5];
		int i, j, temp;
		System.out.println("Enter 5 numbers: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (i = 0; i < 5; i++) {
			String s = br.readLine();
			a[i] = Integer.parseInt(s);
		}

		System.out.println("The Descending order of the numbers you entered are: ");

		for (i = 0; i < 5; i++) {
			for (j = i + 1; j < 5; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	public static void SortAlphabetically() throws IOException {
		System.out.println("Enter the work you want to sort alphabetically: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int i, j;
		int len = s.length();
		char temp;
		char ch[] = new char[len];

		for (i = 0; i < len; i++) {
			ch[i] = s.charAt(i);
		}
		
		System.out.print("The alphabetical order of " + s + " is: ");
		for (i = 0; i < s.length(); i++) {
			for (j = i + 1; j < s.length(); j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}

			System.out.print(ch[i]);
		}

	}
	
	public static void SortEmployeeNameAscendingly() throws IOException
	{
		int NoOfEmployees;
		System.out.print("How many Employees Name do you want to Enter:-  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		NoOfEmployees = Integer.parseInt(s);
		String[] Employees = new String[NoOfEmployees];
		
		for (int i = 0; i < Employees.length; i++) {
			System.out.print("Enter Employee " + i + ": ");
			Employees[i] = br.readLine();
		}
		
		System.out.println("Ascendingly sorted employee names");
		for (int i = 0; i < Employees.length; i++) {
			for (int j = i+1; j < Employees.length; j++) {
				if (Employees[j].compareTo(Employees[i]) < 0 ) {
					String temp = Employees[i];
					Employees[i] = Employees[j];
					Employees[j] = temp;
				}
			}
			System.out.println(i+1 +". "+Employees[i] );
		}
		
	}
	
	
	/**** Sorting of the rect objects "Sorting elements of a List Type Rect ascendingly" ******/
	/*	
		Rect temp = null;
		System.out.println("The Ascending order of the numbers you entered is: ");
		for (int i = 0; i < recList.size(); i++) {
			for (int j = i + 1; j < recList.size(); j++) {
				
				if (recList.get(i).x >  recList.get(j).x) {
					temp = recList.get(i);
					recList.set(i,recList.get(j));
					recList.set(j,temp);
				}
			}
		}
	 */
}
