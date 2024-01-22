package easy_level;
/*  Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned 
    integer should be non-negative as well.
    You must not use any built-in exponent function or operator.
	For example, do not use pow(x, 0.5) or x ** 0.5 .
 
	Example 1:
	Input: x = 4
	Output: 2
	Explanation: The square root of 4 is 2, so we return 2.
    
    Example 2:
	Input: x = 8
	Output: 2
	Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 * 
 */
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int res = sqrt(x);
		System.out.println("result is " + res);
		sc.close();

	}

	static int sqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		int left = 1, right = x / 2, mid = 0, res = 0;

		while (left <= right) {
			mid = (left + right) / 2;
			if (mid * mid == x)
				return mid;
			else if (mid * mid > x) {
				right = mid - 1;

			} else {
				left = mid + 1;
				res = mid;
			}
		}
		return res;
	}

}
