package practiceProblem21to30;

import java.util.Scanner;

public class BitwiseAnd21 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Bitwise And Calcualtor: ");

		System.out.print(" Enter The First NUmber : ");
		int A = Scan.nextInt();

		System.out.print(" Enter The Second NUumber : ");
		int B = Scan.nextInt();

		int res = A & B;
		
		
		System.out.println(" Output Is : " + res);
	}
}