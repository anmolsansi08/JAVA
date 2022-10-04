package basic_java;

public class pattern_17 {

	public static void main(String[] args) {

		int n = 5;

//		pattern17(n);
//		pattern21(n);
//		pattern23(n);
		pattern32(2 * n - 1);
	}

	public static void pattern32(int n) {
		int count = 0;
		
		for (int r = 0; r < n; r++) {
			if (r <= n / 2) {
				count++;
				for (int c2 = 1; c2 <= 2 * r + 1; c2++) {
					if (c2 % 2 == 0)
						System.out.print('*');
					else
						System.out.print(count);
				}

			} else {
				count--;
				for (int c2 = 2*(n - r) - 1; c2 > 0; c2--) {
					if (c2 % 2 == 0)
						System.out.print('*');
					else
						System.out.print(count);
				}
			}

			System.out.println();

		}
	}

	public static void pattern27(int n) {
		for (int r = 0; r < n; r++) {
			for (int c1 = n - r; c1 > 0; c1--)
				System.out.print(' ');

			for (int c2 = 0; c2 <= r; c2++) {
				System.out.print(c2 + 1);
			}

			for (int c2 = r; c2 > 0; c2--)
				System.out.print(c2);

			System.out.println();
		}
	}

	public static void pattern25(int n) {
		int count = 1;
		for (int r = 0; r < n; r++) {
			for (int c1 = n - 1 - r; c1 > 0; c1--)
				System.out.print(' ');

			for (int c2 = 2 * r + 1; c2 > 0; c2--) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

	public static void pattern24(int n) {
		for (int r = 0; r < n; r++) {
			for (int c1 = n - 1 - r; c1 > 0; c1--)
				System.out.print(' ');

			for (int c2 = 2 * r + 1; c2 > 0; c2--)
				System.out.print(r + 1);

			System.out.println();
		}

	}

	public static void pattern23(int n) {
		for (int r = 0; r < n; r++) {
			for (int c1 = n - 1 - r; c1 > 0; c1--)
				System.out.print(' ');

			for (int c2 = 2 * r + 1; c2 > 0; c2--)
				System.out.print('1');

			System.out.println();
		}

	}

	public static void pattern21(int n) {
		for (int r = 0; r < n; r++) {

			for (int c1 = 0; c1 <= r; c1++)
				System.out.print("*");

			for (int c2 = 2 * (n - 1 - r) - 1; c2 > 0;) {
				System.out.print(' ');
				c2 = c2 - 1;
			}

			int c1 = 0;
			if (r == n - 1)
				c1 = 1;
			for (; c1 <= r; c1++)
				System.out.print("*");

			System.out.println();
		}

	}

	public static void pattern17(int n) {
		for (int r = 0; r < n; r++) {

			if (r <= n / 2) {
				for (int c1 = n / 2 - r; c1 > 0; c1--)
					System.out.print(' ');

				for (int c2 = 0; c2 <= r; c2++)
					System.out.print('*');

				for (int c2 = 0; c2 < r; c2++)
					System.out.print('*');

				for (int c1 = n / 2 - r; c1 > 0; c1--)
					System.out.print(' ');
			} else {
				for (int c2 = 0; c2 < r - n / 2; c2++)
					System.out.print(' ');

				for (int c1 = n - r; c1 > 0; c1--)
					System.out.print('*');

				for (int c1 = n - r - 1; c1 > 0; c1--)
					System.out.print('*');

				for (int c2 = 0; c2 < r - n / 2; c2++)
					System.out.print(' ');
			}

			System.out.println();
		}
	}

}
