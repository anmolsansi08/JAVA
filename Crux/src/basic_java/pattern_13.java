package basic_java;

import java.util.Scanner;

public class pattern_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//
//		for (int r = 0; r < 2 * n - 1; r++) {
//
//			if (r < n)
//				for (int c1 = 0; c1 <= r; c1++)
//					System.out.print("*");
//			else
//				for (int c2 = (n - ((r+1) % n)); c2 > 0; c2--)
//					System.out.print("*");
//
//			System.out.println();
//
//		}

		
		//////// More efficient way
		
		n = 2*n -1;
		int number_of_stars = 1;
		for(int r = 0; r < n; r++) {
			for(int c  = number_of_stars; c>0; c--) 
				System.out.print("*");
				
			if(r < n/2)
				number_of_stars++;
			else
				number_of_stars--;
			System.out.println();
		}
		
		
	}
}