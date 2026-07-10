package practiceProblem21to30;

import java.util.Scanner;

public class BitwiseRight26 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Bitwise Right Shift Calcualtor: ");

		System.out.print(" Enter The NUmber : ");
		int B = Scan.nextInt();

		int res = B >> 2; // power of 2 means shift digit to Right and it Divide by 2

		System.out.println(" Output Is : " + res);
	}
}