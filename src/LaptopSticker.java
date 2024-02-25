import java.util.Scanner;

public class LaptopSticker {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int wc = myScanner.nextInt();
		int hc = myScanner.nextInt();
		int ws = myScanner.nextInt();
		int hs = myScanner.nextInt();
		
		if ((wc - ws >= 2) && (hc - hs >= 2)) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}

	}

}
