package basic_java;

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int r = 0; r < n; r++) {
			for (int c = n - r; c > 0; c--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
