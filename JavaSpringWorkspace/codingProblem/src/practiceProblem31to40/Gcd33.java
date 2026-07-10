package practiceProblem31to40;
 
import java.util.Scanner;

public class Gcd33 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To GCD Calculator  ");
		System.out.print(" Enter The First Number : ");
		int num1 = Scan.nextInt();

		System.out.print(" Enter The Second Number : ");
		int num2 = Scan.nextInt();

		int n = GCD(num1, num2);

		System.out.println(" Your GCD IS " + n);

	}

	public static int GCD(int num1, int num2) {

		int gcd = 1;
		int i = 2;

		int least = Least(num1, num2);

		while (i <= least) {

			if (num1 % i == 0 && num2 % i == 0) {

				gcd = i;

			}
			i++;
		}
		return gcd;

	}

	public static int Least(int num1, int num2) {

		if (num1 < num2) {
			return num1;
		} else {
			return num2;

		}
	}
}
