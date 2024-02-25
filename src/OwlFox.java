import java.util.Scanner;

public class OwlFox {
	
	public static int countsTrailingZeros (String num) {
		int length = num.length();
		int count = 0;
		for (int i = length - 1; i >= 0; i-- ) {
			if (Character.getNumericValue(num.charAt(i)) == 0) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int numLines = myScanner.nextInt();

		for (int i = 0; i < numLines; i++) {
			String numToCompare = myScanner.next();
			int result = Integer.parseInt(numToCompare);
			int powerOfTen = countsTrailingZeros(numToCompare);
			double multipleOfTen = Math.pow(10, powerOfTen);
			int resultMultiplier = (int) multipleOfTen;
			if (powerOfTen == 0) {
				result -= 1;
			} else {
				result = ((result / resultMultiplier) - 1) * resultMultiplier;
			}
			System.out.println(result);
		}

	}

}
