package practiceProblem31to40;

import java.util.Scanner;

public class Prime34 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome To Prime Number Calculator : ");
		System.out.print("Enter The Number :");

		int num = Scan.nextInt();

		boolean prime = ISPrime(num);

		if (prime) {
			System.out.println("Its A Prime Number ");
		} else {
			System.out.println("Its Not A Prime Number ");
		}
	}

	public static boolean ISPrime(int num) {
		int i = 2;

		while (i < num) {
			if (num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}