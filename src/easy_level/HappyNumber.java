package easy_level;

import java.util.ArrayList;
import java.util.List;

/*  Example 1:

	Input: n = 19
	Output: true
	
	Explanation:
	12 + 92 = 82
	82 + 22 = 68
	62 + 82 = 100
	12 + 02 + 02 = 1
	
	Example 2:
	Input: n = 2
	Output: false
 * 
 */
public class HappyNumber {

	public static void main(String[] args) {
		int n = 2;
		boolean b = isHappyNumber(n);
		System.out.println(b);
		System.out.println(sumOfSqureDigits(n));
	}

	static List<Integer> list = new ArrayList<>();

	private static boolean isHappyNumber(int n) {
		if (n == 1) {
			return true;
		}
		boolean ans = false;
		int sum = sumOfSqureDigits(n);
		
		if (list.contains(sum)) {
			ans = false;
		} else if (sum == 1)
			ans = true;
		else {
			list.add(sum);
			ans = isHappyNumber(sum);
		}
		return ans;
	}

	static int sumOfSqureDigits(int n) {
		if (n < 10) {
			return (int) Math.pow(n, 2);
		}
		return (int) Math.pow(n % 10, 2) + sumOfSqureDigits(n / 10);
	}

}
