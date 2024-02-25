import java.util.Scanner;

public class ADifferentProblem {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		long first, second, result;
		
		while (myScanner.hasNextLong()) {
			first = myScanner.nextLong();
			second = myScanner.nextLong();
			
			if (first > second) {
				result = first - second;
			} else {
				result = second - first;
			}
			
			System.out.println(result);
		}

	}

}
