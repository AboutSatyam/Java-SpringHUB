package practiceProblem31to40;

import java.util.Scanner;

public class Lcm32 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To LCM Calculator  ");
		System.out.print(" Enter The First Number : ");
		int num1 = Scan.nextInt();

		System.out.print(" Enter The Second Number : ");
		int num2 = Scan.nextInt();

		int n = LCM(num1, num2);

		System.out.println(" Your LCM IS " + n);

	}

	public static int LCM(int num1, int num2) {

		int i = 1;
		while (true) {

			int factor = num1 * i;

			if (factor % num2 == 0) {
				
				return factor;
			}
			i++;
		}

	}
}
