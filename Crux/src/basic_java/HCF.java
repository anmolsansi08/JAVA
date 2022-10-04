package basic_java;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		float n1 = scn.nextFloat();
		float n2 = scn.nextFloat();
		float r, divident, divisor;

		if (n1 > n2) {
			divident = n1;
			divisor = n2;
		} else {
			divident = n2;
			divisor = n1;
		}
		
		while (true) {
			r = divident % divisor;
			
			if(r <= 0) {
				System.out.println(divisor);
				break;
			}
			
			divident = divisor;
			divisor = r;
		}

	}

}
