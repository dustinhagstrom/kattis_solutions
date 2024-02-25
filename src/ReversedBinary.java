import java.util.Scanner;

public class ReversedBinary {

	public static String convertsToBinary(int num) {
		if (num < 2){
			return Integer.toString(num);
		} else {
			int newNum = num / 2;
			int remainder = num % 2;
			String binNum = Integer.toString(remainder);
			return convertsToBinary(newNum) + binNum;
		}
		
		
	}

	public static String reversesBinary(String binaryString) {
		int length = binaryString.length();
		String reversedNum = "";
		for (int i = length - 1; i >= 0; i--) {
			char currentLetter = binaryString.charAt(i);
			reversedNum += currentLetter;
		}
		return reversedNum;
	}

	public static int convertsToInt(String binaryString) {
		int length = binaryString.length();
		int result = 0;
		int j = 0;
		for (int i = length - 1; i >= 0; i--) {
			result += Character.getNumericValue(binaryString.charAt(i)) * Math.pow(2, j);
			j++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int inputNum = myScanner.nextInt();

		String numInBinary = convertsToBinary(inputNum);
		String binaryInNum = reversesBinary(numInBinary);
		int result = convertsToInt(binaryInNum);

		System.out.print(result);
	}

}
