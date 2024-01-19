package easy_level;

import java.util.Arrays;
import java.util.Scanner;

/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
   The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain 
   any leading 0's.Increment the large integer by one and return the resulting array of digits.
	
    Example 1:
	
    Input: digits = [1,2,3]
	Output: [1,2,4]
	
	Explanation: The array represents the integer 123.
	Incrementing by one gives 123 + 1 = 124.
	Thus, the result should be [1,2,4].
	
 */
public class PlusOne {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int digits[] = new int[n];
		System.out.println("Enter the value");
		for (int i = 0; i < n; i++) {
			digits[i] = sc.nextInt();
		}
		digits = plusOne(digits);
		System.out.println("Output is " + Arrays.toString(digits));
		sc.close();
	}

	private static int[] plusOne(int digits[]) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {

			if (digits[i] + 1 < 10) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[n + 1];
		digits[0] = 1;

		return digits;
	}
}
