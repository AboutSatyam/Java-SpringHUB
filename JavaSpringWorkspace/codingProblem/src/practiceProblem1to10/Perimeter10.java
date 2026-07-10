package practiceProblem1to10;

import java.util.Scanner;

public class Perimeter10 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome To perimeter calculator");

		System.out.println("Enter Side Of Rectriangle ABCD : ");
		int side = Scan.nextInt();

		int Sum = side + side + side + side;
		System.out.println("Perimeter Of Rectriangle ABCD :" + Sum);

	}

}
