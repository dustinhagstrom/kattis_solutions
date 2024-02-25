import java.util.Scanner;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int magicNum = myScanner.nextInt();
		
		for (int i = 1; i <= magicNum; i++) {
			System.out.println(i + " Abracadabra");
		}

	}

}
