import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int numDifferentPieces = 6;
		int[] idealNumPiecesArray = {1, 1, 2, 2, 2, 8};

		for (int i = 0; i < numDifferentPieces; i++) {
			int currentNumPieces = myScanner.nextInt();
			System.out.print(idealNumPiecesArray[i] - currentNumPieces + " ");	
		}
	}
}
