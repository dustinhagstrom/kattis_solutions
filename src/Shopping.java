import java.util.Scanner;
public class Shopping {


	public static String[][] makesListArray(Scanner scanner, int outsideArrayLength, int insideArrayLength) {
		String[][] arrayOfLists = new String[outsideArrayLength][];
		for (int i = 0; i < outsideArrayLength; i++) {
			String[] completeList = new String[insideArrayLength];
			for (int j = 0; j < insideArrayLength; j++){
				completeList[j] = scanner.next();
			}
			arrayOfLists[i] = completeList;
		}
		System.out.println("arrayOfLists[0][0] " + arrayOfLists[0][0]);
		return arrayOfLists;
	}

	public static String[] removesDuplicatesInLists (String[][] array){
		int lengthOutsideArray = array.length;
		int lengthInsideArray = array[0].length;
		// System.out.println("lengthInsideArray " + lengthInsideArray);
		// System.out.println("array[0][0] " + array[0][0]);
		// System.out.println("array[0][1] " + array[0][1]);
		// System.out.println("array[0][2] " + array[0][2]);
		// System.out.println("array[0][3] " + array[0][3]);
		// System.out.println("array[0][4] " + array[0][4]);

		// int count = 0;
		// 	for (int z = 0; z < lengthInsideArray; z++) {
		// 		if (array[0] != null) {
		// 			count++;
		// 		}
		// 	}
		// 	String[] answerArray = new String[count];
		// 	for (int y = 0; y < count; y++){
		// 		answerArray[y] = array[0][y];
		// 	}
		// 	return answerArray;

		if (array.length == 1) {
			return array[0];
		}
		// int matchedIndex = 0;
		// int holdingArrayIndex = 0;
		// int nestedArrayIndex = 0;
		int lengthHoldingArray = lengthOutsideArray - 1;
		String[][] holdingArray = new String[lengthHoldingArray][lengthInsideArray];
		String[] matchedWordsArray = new String[lengthInsideArray];
// System.out.println("matchedWordsArraylength: " + matchedWordsArray.length);
// System.out.println("matchedWordsArray[0]: " + matchedWordsArray[0]);
// matchedWordsArray[0] = array[0][0];
// System.out.println("matchedWordsArray[0]: " + matchedWordsArray[0]);
// System.out.println("matchedWordsArray[1]: " + matchedWordsArray[1]);
// System.out.println("matchedWordsArray[2]: " + matchedWordsArray[2]);
// System.out.println("matchedWordsArray[3]: " + matchedWordsArray[3]);
// System.out.println("matchedWordsArray[4]: " + matchedWordsArray[4]);

		for (int i = 0; i < lengthInsideArray; i++){
			for (int j = 0; j < lengthInsideArray; j++) {
				if (array[0][i] != null) {
					if (array[0][i].equals(array[1][j])){
						matchedWordsArray[i] = array[0][i];
					}
				}
			}
		}
		holdingArray[0] = matchedWordsArray;
		for (int k = 1; k < lengthHoldingArray; k++) {
			holdingArray[k] = array[k];
		}
		return removesDuplicatesInLists(holdingArray);
		// for (int i = 1; i < lengthOutsideArray; i++){
		// 	System.out.println("outerloopIteratorLimit: " + (lengthOutsideArray - 1));
		// 	System.out.println("outerloopIndex: " + i);
		// 	System.out.println("inside for loop array[0][0] " + array[0][0]);
		// 	for (int j = 0; j < lengthInsideArray; j++) {
		// 		System.out.println("innerloopIndex: " + j);
		// 		System.out.println("array[i][j]: " + array[i][j]);
		// 		System.out.println("1st condition check: " + (array[i][j] != null));
		// 		if ((array[i][j] != null)) {
		// 			if ((array[i][j].equals(array[0][nestedArrayIndex]))){
		// 				System.out.println("2nd condition check: " + array[i][j].equals(array[0][nestedArrayIndex]));
		// 				System.out.println("matchedIndex: " + matchedIndex);
		// 				System.out.println("array[0][nestedArrayIndex] " + array[0][nestedArrayIndex]);
		// 				System.out.println("array[i][j]: " + array[i][j]);
		// 				matchedWordsArray[matchedIndex++] = array[i][j]; 
		// 			}
		// 		}
		// 		System.out.println("matchedWordsArray[j]" + matchedWordsArray[j]);
		// 	}
		// 	holdingArray[holdingArrayIndex++] = matchedWordsArray;
		// 	nestedArrayIndex++;
		// 	matchedIndex = 0;
		// }
		// return removesDuplicatesInLists(holdingArray);
	}
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String firstLine = myScanner.nextLine();
		String[] firstLineArray = firstLine.split(" ");
		int numLists = Integer.parseInt(firstLineArray[0]);
		int numItemsInList = Integer.parseInt(firstLineArray[1]);

		String[][] arrayOfLists = makesListArray(myScanner, numLists, numItemsInList);
		String[] resultsList = removesDuplicatesInLists(arrayOfLists);

		System.out.println(resultsList.length);
		for (int i = 0; i < resultsList.length; i++) {
			System.out.println(resultsList[i]);
		}


		
		
	}

}
