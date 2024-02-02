package easy_level;

public class AdditionBinary {

	public static void main(String[] args) {
		String a = "101";
		String b = "1";
		int carry = 0;
		String ans = "";
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
			int n1 = (i >= 0) ? (a.charAt(i) == '1') ? 1 : 0 : 0;
			int n2 = (j >= 0) ? (b.charAt(j) == '1') ? 1 : 0 : 0;

			String val = carry + "" + n1 + "" + n2;
			if ("111".equals(val)) {
				ans = "1" + ans;
				carry = 1;
			} else if ("001".equals(val) || "010".equals(val)) {
				ans = "1" + ans;
				carry = 1;
			} else if ("011".equals(val)) {
				ans = "0" + ans;
				carry = 1;
			} else {
				ans = "0" + ans;
				carry = -1;
			}

		}
		System.out.println(ans);

	}

}
