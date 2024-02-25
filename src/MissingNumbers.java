import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int numLines = myScanner.nextInt();
		int[] intArray = new int[numLines];
		for (int i = 0; i < numLines; i++) {
			intArray[i] = myScanner.nextInt();
		}
		int lastNum = intArray[numLines - 1];
		if (lastNum == intArray.length) {
			System.out.println("good job");
		} else {
			int indexOfGivenArray = 0;
			for (int j = 1; j <= lastNum; j++) {
				if (intArray[indexOfGivenArray] == j) {
					indexOfGivenArray++;
				} else {
					System.out.println(j);
				}
			}
		}
	}
}
