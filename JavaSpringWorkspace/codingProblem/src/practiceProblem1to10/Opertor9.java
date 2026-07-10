package practiceProblem1to10;

import java.util.Scanner;

public class Opertor9 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter the 1st Number : ");

		int m = Scan.nextInt();
/
		System.out.println("Enter the 2nd Number : ");

		int n = Scan.nextInt();

		int a = m + n;
		int b = m - n;
		int c = m * n;
		int d = m / n;
		int e = m % n;

		System.out.println("Add Of two Number is : " + a);
		System.out.println("Sub Of two Number is : " + b);

		System.out.println("Multi Of two Number is : " + c);
		System.out.println("Divide Of two Number is : " + d);

		System.out.println("modulus Of two Number is : " + e);

	}

}
