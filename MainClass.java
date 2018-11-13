package main;

import java.io.IOException;

import programs.AscendingDescendingSorting;
import programs.multipleinheritance.Area;
import programs.multipleinheritance.Rectangle;
import programs.multipleinheritance.Triangle;

public class MainClass {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/***Patterns*****/
//		Patterns.pattern1();
//		Patterns.pattern2();
//		Patterns.pattern3();
		
		/** MinMaxNumbers***/
//		MinMaxNumbers.MinNumber();
		
		/**Ascending Descending Order**/
			//AscendingDescendingOrder.SortAscendingly();
//			AscendingDescendingOrder.SortDescendingly();
//			AscendingDescendingOrder.SortAlphabetically();
			//AscendingDescendingSorting.SortEmployeeNameAscendingly();
		
		/**PrimeOddOrEvenNumber**/
		//PrimeOddOrEvenNumber.CheckOddOrEven();
//		PrimeOddOrEvenNumber.PrimeNumberOrNot();
		
		
		/*** Swapping ****/
//		Swapping.SwapUsingTwoVariables();
		//Swapping.SwapUsingThreeVariables();
		
		/**** Compare Strings ******/
//		CompareStrings.Compare();
		//CompareStrings.ChooseBiggerInLength();
			
		
			
		/**** Multiple Inheritance ****/
		Rectangle rect = new Rectangle();
		Triangle  tri = new Triangle();
		Area area;
		area = rect;
		System.out.println("Area of Rectangle: " + area.compute(1, 2));
		area = tri ;
		System.out.println("Area of Triangle: " + area.compute(10, 2));
		
		
	}

}
