package basic_java;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		
		for (int r = 0; r < n; r++) {
			
			for (int c2 = 0; c2 < r; c2++)
				System.out.print(" ");
			
			for (int c1 = n - r; c1 > 0; c1--) {
				System.out.print("*");
			}

			
			System.out.println();
		}
	}

}
