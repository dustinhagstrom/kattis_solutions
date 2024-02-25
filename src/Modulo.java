import java.util.Scanner;

public class Modulo {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int manyIntInputs = 10;
		int numDistinctValues = 0;
		
		int[] holdingArray = new int[manyIntInputs];
		for (int i = 0; i < manyIntInputs; i++) {
			holdingArray[i] = myScanner.nextInt() % 42;
			
		}
		for (int j = 0; j < manyIntInputs; j++) {
			if (holdingArray[j] != -1) {
				int checkNum = holdingArray[j];
				holdingArray[j] = -1;
				numDistinctValues++;
				for (int k = j + 1; k < manyIntInputs; k++){
					if (checkNum == holdingArray[k]){
						holdingArray[k] = -1;
					}
				} 
			}
		}
		System.out.println(numDistinctValues);
	}

}
