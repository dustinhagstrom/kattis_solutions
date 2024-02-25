import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int dataPerMonth, numMonths, totalData, currentMonthUsage;
		
		dataPerMonth = myScanner.nextInt();
		numMonths = myScanner.nextInt();
		
		totalData = dataPerMonth;
		
		for (int i = 1; i <= numMonths; i++) {
			currentMonthUsage = myScanner.nextInt();
			totalData += dataPerMonth;
			totalData -= currentMonthUsage;
		}
		System.out.print(totalData);
	}

}
