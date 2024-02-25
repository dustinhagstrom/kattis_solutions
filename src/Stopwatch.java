import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int numTimesClockRuns, clockDisplay;
		int timesButtonPressed = myScanner.nextInt();

		clockDisplay = 0;

		if (timesButtonPressed % 2 == 0) {

			numTimesClockRuns = timesButtonPressed / 2;

			for (int i = 0; i < numTimesClockRuns; i++) {
				int startTime = myScanner.nextInt();
				int endTime = myScanner.nextInt();
				clockDisplay += endTime - startTime;
			}
			System.out.print(clockDisplay);
		} else {
			System.out.println("still running");
		}
	}

}
