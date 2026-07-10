package practiceProblem11to20;

import java.util.Scanner;

public class CanfF14 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Temperature Calcaluator : ");
		System.out.println("Enter TheTemp In Fahrentie : ");

		float F = Scan.nextFloat();

		// float Total = (F - 32) * 5 / 9; // Coreet with sometime not work

		float Total = (F - 32) * 5.0f / 9.0f;

		System.out.println("The Temp In Celcius is : " + Total);

	}

}
