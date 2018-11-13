package programs;

public class Patterns {

	/** 
	 * 		* * * * * 
	 *  	 * * * *
	 *        * * * 
	 *         * *
	 *          * 
	 * **/
	public static void pattern1() {
		int i,j,k;
		for (i = 0;  i<=5; i++) {
			for (j = 1;  j<=i; j++) {
				System.out.print(" ");
			}
			for (k = 5-i;  k>0; k--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	/** 
	 * 		* * * * * 
	 *  	* * * *
	 *  	* * *
	 *  	* *
	 *  	*
	 * **/
	public static void pattern2() {
		int i,j;
		for (i = 0;  i<=5; i++) {
			for (j = 5-i;  j >=0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	/** 
	 * 		*  
	 *  	* * 
	 *  	* * *
	 *  	* * * * 
	 *  	* * * * *
	 * **/
	public static void pattern3() {
		int i,j;
		for (i = 0; i <=5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
