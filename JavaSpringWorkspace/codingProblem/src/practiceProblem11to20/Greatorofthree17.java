package practiceProblem11to20;

import java.util.Scanner;

public class Greatorofthree17 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Greator Of three Calculator  ");

		System.out.println(" Enter The First Number : ");

		float A = Scan.nextFloat();

		System.out.println(" Enter The Second Number : ");

		float B = Scan.nextFloat();

		System.out.println(" Enter The Third Number : ");

		float C = Scan.nextFloat();

		{
			if (A >= B && A >= C) {
				System.out.println("First Value Is Greator : " + A);
			}

			else if (B >= C && B >= A) {
				System.out.println("Second  Value Is Greator : " + B);
			}

			else if (A == B && B == C) {
				System.out.println("All 3 Value is Equal : ");
			}

//			else if (A == B && A != C) {
//				System.out.println("First And FSecond Value is same : ");
//			}
//
//			else if (A == C && A != B) {
//				System.out.println("First And Third Value is same : ");
//			}

			else {
				System.out.println("Third  Value Is Greator : " + C);
			}

		}

	}

}
