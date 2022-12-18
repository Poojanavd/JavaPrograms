//Java program to check if number is odd or even

package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIfNumberIsOddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if is even or odd : ");
		int no = 0;
		try {
			no = sc.nextInt();
			if (no < 0) {
				System.out.println("Please enter a postive number");
			} else {
				String result = (no % 2 == 0) ? "Even number" : "odd number";
				System.out.println(no + " is " + result);
			}
		} catch (InputMismatchException e) {
			System.out.println("Input is not an integer number, please enter a positive number");
		}
		sc.close();
	}
}
