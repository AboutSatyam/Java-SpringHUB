package practiceProblem31to40;

import java.util.Scanner;

public class Fibonacci36 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome Fibonacci Method ");
		System.out.print("Enter The Number : ");
		int num = Scan.nextInt();

		System.out.print("Here Is a fibonaaci Series is : ");

		Print(num);

	}

	public static void Print(int num) {

		if (num < 0)
			return;
		System.out.print("0 ");
		if (num == 0)
			return;

		System.out.print("1 ");

		int num1 = 0, num2 = 1;

		while (num1 + num2 <= num)

		{

			int num3 = num1 + num2;
			System.out.print(num3 + " ");

			num1 = num2;
			num2 = num3;

		}
	}
}