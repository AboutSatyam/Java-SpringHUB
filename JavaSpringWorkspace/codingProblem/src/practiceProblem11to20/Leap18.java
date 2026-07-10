package practiceProblem11to20;

import java.util.Scanner;

public class Leap18 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Year Calcualtor: ");
		// int yrs = Scan.nextInt();

		System.out.println(" Enter The Yrs : ");
		int yrs = Scan.nextInt();

		if (yrs % 400 == 0 || (yrs % 4 == 0 && yrs % 100 != 0)) {
			System.out.println(" Its A Leap Year : " + yrs);
		}

		else {
			System.out.println(" Its Not A Leap Year :" + yrs);
		}
	}

}
