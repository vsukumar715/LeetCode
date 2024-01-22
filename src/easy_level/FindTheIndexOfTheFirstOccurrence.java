package easy_level;

import java.util.Scanner;
/*  
 Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
 or -1 if needle is not part of haystack.
 
 Example 1:
 Input: haystack = "sadbutsad", needle = "sad"
 Output: 0
 Explanation: "sad" occurs at index 0 and 6.
   The first occurrence is at index 0, so we return 0.
 Example 2:

 Input: haystack = "leetcode", needle = "leeto"
 Output: -1
 Explanation: "leeto" did not occur in "leetcode", so we return -1.
  
 */

public class FindTheIndexOfTheFirstOccurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str1 = sc.nextLine();
		System.out.println("Enter the string 2");
		String str2 = sc.nextLine();
		int index = indexOf(str1, str2);
		System.out.println(index);
		sc.close();
	}

	private static int indexOf(String haystack, String needle) {

		if (haystack.equals(needle))
			return 0;

		int i = 0, j = 0;
		while (i <= haystack.length() - needle.length()) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int k = i;
				while (j < needle.length()) {
					if (haystack.charAt(k) == needle.charAt(j)) {
						j++;
						k++;
					} else {
						j = 0;
						break;
					}
				}
				if (j == needle.length())
					return i;
			}
			i++;
		}
		return -1;
	}
}
