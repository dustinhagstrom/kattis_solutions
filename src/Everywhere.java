import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int numTestCases = myScanner.nextInt();
		String[][] arrayOfData = new String[numTestCases][];
		String[] arrayOfCities;

		while(myScanner.hasNext()) {
			//this block puts scanner input into two dimensional array
			for (int i = 0; i < numTestCases; i++) {
				int numCities = myScanner.nextInt();
				arrayOfCities = new String[numCities];
				for (int j = 0; j < numCities; j++) {
					arrayOfCities[j] = myScanner.next();
				}
				arrayOfData[i] = arrayOfCities;
			}
			//this block goes to second dimension in array and compares entries
			for (int k = 0; k < numTestCases; k++) {
				int totalNumDifferentCities = 0;
				int cityArrayLength = arrayOfData[k].length;
				for (int l = 0; l < cityArrayLength; l++){
					String currentWord = arrayOfData[k][l];
					if (!currentWord.equals("")){
						totalNumDifferentCities++;
					}
					for (int n = 0; n < cityArrayLength; n++){
						String nextWord = arrayOfData[k][n];
						if (currentWord.equals(nextWord) && !nextWord.isEmpty()){
							arrayOfData[k][l] = "";
							arrayOfData[k][n] = "";
						}
					}
				}
				System.out.println(totalNumDifferentCities);
			}
		}
		
	}

}
