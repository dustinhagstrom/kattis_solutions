import java.util.Scanner;

public class QuadrantSelection {

	public static void main(String[] args) {
		Scanner xScanner = new Scanner(System.in);
		int xCoord = xScanner.nextInt();
		
		Scanner yScanner = new Scanner(System.in);
		int yCoord = xScanner.nextInt();
		
		if (xCoord > 0 && yCoord > 0) {
			System.out.print(1);
		}else if (xCoord > 0 && yCoord < 0) {
			System.out.print(4);
		}else if (xCoord < 0 && yCoord < 0) {
			System.out.print(3);
		}else {
			System.out.print(2);
		}

	}

}
