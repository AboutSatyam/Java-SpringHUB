package practiceProblem11to20;

import java.util.Scanner;

public class SimpleInrerest12 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welome to Simple Interest Calculator");

		System.out.println("Enter The Principal Amount os SI : ");
		double P = Scan.nextDouble();

		System.out.println("Enter The  Rate Of  SI  In Percentage : ");
		double R = Scan.nextDouble();

		System.out.println("Enter The TIme Period In Year  : ");
		double T = Scan.nextDouble();

		double SI = (P * R * T) / 100;

		System.out.println("Simple Interest Amount $ " + SI);

	}

}
