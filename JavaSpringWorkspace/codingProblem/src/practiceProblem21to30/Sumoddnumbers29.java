package practiceProblem21to30;

import java.util.Scanner;

public class Sumoddnumbers29 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Odd Sum Calculator  ");
		System.out.print(" Enter The Number : ");
		int num = Scan.nextInt();
		int sum = oddSum(num);
		System.out.println("Odd Sum till " + num + " is " + sum);
	}

	public static int oddSum(int num) {

		int sum = 0;
		int i = 1;
		while (i <= num) {
			sum += i;
		i += 2;
		}
		return sum;

	}

}
