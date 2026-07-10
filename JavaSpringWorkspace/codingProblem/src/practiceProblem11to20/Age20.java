package practiceProblem11to20;

import java.util.Scanner;

public class Age20 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Age Group  Calcualtor: ");

		System.out.println(" Enter Your Age  : ");
		int age = Scan.nextInt();

		if (age <= 13) {
			System.out.println(" Your Are The Child ");
		} else if (age <= 20) {
			System.out.println(" Your Are The Teenage ");
		} else if (age <= 60) {
			System.out.println(" Your Are The Adult");
		} else if (age > 60) {
			System.out.println(" Your Are The Senior  ");
		}
	}

}
