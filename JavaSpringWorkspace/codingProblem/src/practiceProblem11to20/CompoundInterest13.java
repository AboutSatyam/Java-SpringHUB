package practiceProblem11to20;

import java.util.*;

public class CompoundInterest13 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome To Compound Interest Calculator : ");

		System.out.println("Enter The Principal Amount os CI : ");
		double P = Scan.nextDouble();

		System.out.println("Enter The  Rate Of  CI  In Percentage : ");
		double R = Scan.nextDouble();

		System.out.println("Enter The TIme Period In Year  : ");
		double T = Scan.nextDouble();

		// double CI = P * Math.pow((1+R/100 ) T); // error
		double CI = P * Math.pow((1 + R / 100), T);

		System.out.println("Simple Interest Amount $ " + CI);
	}

}
