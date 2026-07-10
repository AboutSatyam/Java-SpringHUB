package practiceProblem21to30;

import java.util.Scanner;

public class EvenOdd27 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Even Odd Calculator  ");
		System.out.print(" Enter The Number : ");

		int V = Scan.nextInt();
		{
			if ((V & 1) == 0) {
				System.out.println("Its A Even Number  ");
			}

			else {
				System.out.println("Its A Odd Number  ");
			}

		}

	}
}
