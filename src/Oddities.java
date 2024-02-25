import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int currentNum;
		
		int numIterations = myScanner.nextInt();
		
		for(int i = 0; i < numIterations; i++) {
			currentNum = myScanner.nextInt();
			
			if (currentNum % 2 == 0) {
				System.out.println(currentNum + " is even");
			} else {
				System.out.println(currentNum + " is odd");
			}
		}

	}

}
