import java.util.Scanner;

public class ShoppingList {

	public static String[][] makesListArray(Scanner scanner, int outsideArrayLength, int insideArrayLength) {
		String[][] arrayOfLists = new String[outsideArrayLength][];
		for (int i = 0; i < outsideArrayLength; i++) {
			String[] completeList = new String[insideArrayLength];
			for (int j = 0; j < insideArrayLength; j++) {
				completeList[j] = scanner.next();
			}
			arrayOfLists[i] = completeList;
		}
		return arrayOfLists;
	}

	public static String[] removesDuplicatesInLists(String[][] array) {
		int lengthOutsideArray = array.length;
		int lengthInsideArray = array[0].length;

		if (array.length == 1) {
			int count = 0;
			for (int z = 0; z < lengthInsideArray; z++) {
			if (array[0][z] != null) {
			count++;
			}
			}
			String[] answerArray = new String[count];
			int fillCount = 0;
			for (int y = 0; y < lengthInsideArray; y++){
				if (array[0][y] != null) {
					answerArray[fillCount] = array[0][y];
					fillCount++;
					}
			}
			return answerArray;
		}
		int lengthHoldingArray = lengthOutsideArray - 1;
		String[][] holdingArray = new String[lengthHoldingArray][lengthInsideArray];
		String[] matchedWordsArray = new String[lengthInsideArray];

		for (int i = 0; i < lengthInsideArray; i++) {
			for (int j = 0; j < lengthInsideArray; j++) {
				if (array[0][i] != null) {
					if (array[0][i].equals(array[1][j])) {
						matchedWordsArray[i] = array[0][i];
					}
				}
			}
		}
		holdingArray[0] = matchedWordsArray;
		for (int k = 1; k < lengthHoldingArray; k++) {
			holdingArray[k] = array[k + 1];
		}
		return removesDuplicatesInLists(holdingArray);
	}

	public static String[] sortsAlphabetically(String[] unsortedArray) {
		for (int i = 0; i < unsortedArray.length; i++){
			for (int j = 0; j < unsortedArray.length; j++) {
				if (unsortedArray[i].compareTo(unsortedArray[j]) < 0) {
					String hold = unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = hold;
				}
			}
		}
		return unsortedArray;
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String firstLine = myScanner.nextLine();
		String[] firstLineArray = firstLine.split(" ");
		int numLists = Integer.parseInt(firstLineArray[0]);
		int numItemsInList = Integer.parseInt(firstLineArray[1]);

		String[][] arrayOfLists = makesListArray(myScanner, numLists, numItemsInList);
		String[] resultsList = removesDuplicatesInLists(arrayOfLists);
		String[] sortedResults = sortsAlphabetically(resultsList);
		System.out.println(resultsList.length);
		for (int i = 0; i < resultsList.length; i++) {
			System.out.println(sortedResults[i]);
		}
	}
}
