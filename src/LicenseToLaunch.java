import java.util.Scanner;

public class LicenseToLaunch {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		double days, minSpaceJunk, currentSpaceJunk;
		int dayToLaunch = 0;
		
		minSpaceJunk = 10E9;
		
		days = myScanner.nextDouble();
		
		for (int i = 0; i < days; i++) {
			currentSpaceJunk = myScanner.nextDouble();
			
			if (currentSpaceJunk < minSpaceJunk) {
				minSpaceJunk = currentSpaceJunk;
				dayToLaunch = i;
			}
		}
		System.out.print(dayToLaunch);

	}

}
