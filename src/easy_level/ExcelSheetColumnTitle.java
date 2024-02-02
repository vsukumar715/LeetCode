package easy_level;

/*  
	Example 1:
	
	Input: columnNumber = 1
	Output: "A"
	Example 2:
	
	Input: columnNumber = 28
	Output: "AB"
	Example 3:
	
	Input: columnNumber = 701
	Output: "ZY"
 * 
 * 
 */
public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		int n = 701;
		String title = numberToTitle(n);
		System.out.println(title);
	}

	private static String numberToTitle(int n) {
		if (n < 1) {
			return "";
		}
		return numberToTitle((n - 1) / 26) + (char) ((n - 1) % 26 + 65);

	}
}
