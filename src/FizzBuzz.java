import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int x, y, n;
		
		x = myScanner.nextInt();
		y = myScanner.nextInt();
		n = myScanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % x == 0 && i % y == 0) {
				System.out.println("FizzBuzz");
			} else if (i % x == 0) {
				System.out.println("Fizz");
			} else if (i % y == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
