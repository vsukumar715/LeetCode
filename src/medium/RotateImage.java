package medium;

import java.util.Arrays;

public class RotateImage {
	static void pattern(int n) {

		int space = n, start = 1;
		for (int i = 1; i <= n * 2; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= start; k++) {
				System.out.print("* ");
			}

			if (i <= n + 1) {
				if (i != n + 1) {
					space--;
					start++;

				} else {
					space = 0;
					start = n;
				}
			} else {
				start--;
				space++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(2);
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(Arrays.deepToString(matrix));
		rotateImage(matrix);
		System.out.println(Arrays.deepToString(matrix));

	}

	private static void rotateImage(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int j = 0;
			for (int k = n - 1; k >= n / 2; k--) {
				int temp = matrix[i][j];
				matrix[i][j++] = matrix[i][k];
				matrix[i][k] = temp;
			}
		}

	}

}
