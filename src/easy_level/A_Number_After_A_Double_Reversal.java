package easy_level;

import java.util.Scanner;

/* 
	Example 1:
	Input: num = 526
	Output: true
	Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
	
	Example 2:
	Input: num = 1800
	Output: false
	Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
	
	Example 3:
	Input: num = 0
	Output: true
	Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
 * 
 */
public class A_Number_After_A_Double_Reversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int num = sc.nextInt();
		boolean ans = isSameAfterReversals(num);
		System.out.println("result is " + ans);
		sc.close();

	}

	private static boolean isSameAfterReversals(int num) {
		if (num < 9)
			return true;

		int reverseNumber = reverse(num, 0);
		int againReverseNumber = reverse(reverseNumber, 0);

		return num == againReverseNumber;

	}

	public static int reverse(int num, int reversedNum) {

		if (num < 1)
			return reversedNum;

		int lastDigit = num % 10;
		int remainingNum = num / 10;
		reversedNum = reversedNum * 10 + lastDigit;

		return reverse(remainingNum, reversedNum);
	}

}
