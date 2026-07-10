package practiceProblem1to10;

import java.util.Scanner;

public class Swap7 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the a value :");
		int a = Scan.nextInt();

		System.out.println("Enter the b value :");
		int b = Scan.nextInt();

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping The a= " + a + " AND b= " + b);

	}

}
