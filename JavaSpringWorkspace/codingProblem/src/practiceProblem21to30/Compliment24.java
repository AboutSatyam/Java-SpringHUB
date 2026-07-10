package practiceProblem21to30;

import java.util.Scanner;

public class Compliment24 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Bitwise not / Compliment : ");

		System.out.print(" Enter The  Number : ");
		int A = Scan.nextInt();
		int res = ~A;
		System.out.println(" Compliment Is : " + res);

	}

}
