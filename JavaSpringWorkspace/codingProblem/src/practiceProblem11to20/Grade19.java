package practiceProblem11to20;

import java.util.Scanner;

public class Grade19 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Grade Calcualtor: ");
		// double grd = Scan.nextDouble();

		System.out.println(" Enter Your Grade in Percentage : " );
		double grd = Scan.nextDouble();

		if (grd >= 90) {
			System.out.println(" Your Grade Is A ");
		} else if (grd >= 75) {
			System.out.println(" Your Grade Is B ");
		} else if (grd >= 60) {
			System.out.println(" Your Grade Is C ");
		} else if (grd >= 30) {
			System.out.println(" Your Grade Is D ");
		} else if (grd < 30) {
			System.out.println(" Your Grade Is F Means Fail ");
		}

	}

}
