import java.util.Scanner;

public class NastyHacks {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int numLines = myScanner.nextInt();

		for (int i = 0; i < numLines; i++) {
			int revenueNoAds = myScanner.nextInt();
			int revenueAds = myScanner.nextInt();
			int costAds = myScanner.nextInt();

			int adProfit = revenueAds - costAds;
			if (adProfit > revenueNoAds){
				System.out.println("advertise");
			} else if (adProfit == revenueNoAds) {
				System.out.println("does not matter");
			} else {
				System.out.println("do not advertise");
			}
		}
	}

}
