package easy_level;

import java.util.Scanner;

/*  2169. Count Operations to Obtain Zero
	You are given two non-negative integers num1 and num2.
	In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.

	For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4.
    However, if num1 = 4 and num2 = 5, after one operation, num1 = 4 and num2 = 1.
	Return the number of operations required to make either num1 = 0 or num2 = 0.
	
	Input: num1 = 10, num2 = 10
    Output: 1
    
	Explanation: 
	  Operation 1: num1 = 10, num2 = 10. Since num1 == num2, we subtract num2 from num1 and get 
	  num1 = 10 - 10 = 0.
	  Now num1 = 0 and num2 = 10. Since num1 == 0, we are done. 
	  So the total number of operations required is 1
		
	
 * 
 */
public class CountOperationsToObtainZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		int num2 = sc.nextInt();

		int output = countOperations(num1, num2);
		System.out.println("output is " + output);
		sc.close();

	}

	private static int countOperations(int num1, int num2) {
		if (num1 == num2)
			return 1;
		if (num1 == 0 || num2 == 0)
			return 0;
		int operations = 0;

		while (num1 != 0 && num2 != 0) {
			if (num1 >= num2) {
				operations += num1 / num2;
				num1 %= num2;
			} else {
				operations += num2 / num1;
				num2 %= num1;
			}

		}
		return operations;
	}

}
