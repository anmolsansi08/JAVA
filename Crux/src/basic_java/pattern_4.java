package basic_java;

import java.util.Scanner;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int r = 0; r < n; r++) {
			for (int c1 = n - r - 1; c1 > 0; c1--) {
				System.out.print(" ");
			}
			
			for (int c2 = 0; c2 <= r; c2++)
				System.out.print("*");
			System.out.println();
		}

	}

}
