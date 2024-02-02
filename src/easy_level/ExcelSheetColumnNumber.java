package easy_level;
/* Example 1:
	
	Input: columnTitle = "A"
	Output: 1
	Example 2:
	
	Input: columnTitle = "AB"
	Output: 28
	Example 3:
	
	Input: columnTitle = "ZY"
	Output: 701
 * 
 */
public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		String s = "AB";
		int ans = titleToNumber(s);
		System.out.println(ans);
		
		int n = titleToNumber(s,0,s.length()-1);
		System.out.println(n);
	}

	private static int titleToNumber(String str) {
		int pow = 0;
		int sum = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			sum = sum + ((int) str.charAt(i)-64) * (int) Math.pow(26, pow++);
		}
		return sum;
	}
	//Using recursion
	private static int titleToNumber(String title, int val,int index) {
		if(index==-1) {
			return 0;
		}
		int sum = ((int)title.charAt(index)-64) *((int)Math.pow(26,val));
		return sum+titleToNumber(title,val+1,index-1);
	}

}
