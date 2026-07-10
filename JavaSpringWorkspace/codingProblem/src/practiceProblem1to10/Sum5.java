package practiceProblem1to10;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) {

	
		// If we take user input from user Then

		// int a,b;
		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter The 1 Number : ");
		int a = Scan.nextInt();

		System.out.println("Enter The 2 Number : ");
		int b = Scan.nextInt();

		int c = a + b;

		System.out.println("Sum Of Two Number Is :" + c);

	}

}
