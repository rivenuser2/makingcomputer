package AIV;

import java.util.Scanner;

public class Aiv_1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum;
		sum = sumab(a, b);
		System.out.println(sum);

		int min;
		min = minab(a, b);
		System.out.println(min);

		int gob;
		gob = gobab(a, b);
		System.out.println(gob);

		double nan;
		nan = nanab(a, b);
		System.out.println(nan);
	}

	static int sumab(int a, int b) {
		return a + b;
	}

	static int minab(int a, int b) {
		return a - b;
	}

	static int gobab(int a, int b) {
		return a * b;
	}

	static double nanab(double a, double b) {
		return a / b;
	}
}
