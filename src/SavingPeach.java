import java.util.Scanner;
import java.util.Arrays;

public class SavingPeach {

	public static int[] populatesArray(int length) {
		int[] populatedArray = new int[length];
		for (int i = 0; i < length; i++) {
			populatedArray[i] = i;
		}
		return populatedArray;
	}

	public static int[] populatesArray(int length, Scanner scanner) {
		int[] populatedArray = new int[length];
		for (int i = 0; i < length; i++) {
			populatedArray[i] = scanner.nextInt();
		}
		Arrays.sort(populatedArray);
		return populatedArray;
	}

	public static int[] removesDuplicates(int[] array) {
		int lengthGivenArray = array.length;
		if (lengthGivenArray == 1) {
			return array;
		} else {
			int numDuplicates = 0;
			for (int i = 0; i < lengthGivenArray - 1; i++) {
				for (int n = i + 1; n < lengthGivenArray; n++) {
					if (array[i] == array[n]) {
						array[i] = -1;
						numDuplicates++;
						i++;
					} else {
						i = n;
					}
				}
			}
			int numCorrectObstacles = lengthGivenArray - numDuplicates;
			int[] noDuplicates = removesNegativesFromArray(array, numCorrectObstacles);
			return noDuplicates;
		}
	}

	public static int[] removesNegativesFromArray(int[] array, int lengthOfNewArray) {
		int[] holdingArray = new int[lengthOfNewArray];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				holdingArray[index++] = array[i];
			}
		}
		return holdingArray;
	}

	public static int[] comparesArray(int[] courseArray, int[] marioArray) {
		int largeLength = courseArray.length;
		int smallLength = marioArray.length;
		int outputArrayLength = largeLength - smallLength;
		int[] mutatedCourseArray = courseArray;
		int[] outputArray = new int[outputArrayLength];
		int trackingIndex = 0;
		for (int i = 0; i < largeLength; i++) {
			for (int j = 0; j < smallLength; j++) {
				if (courseArray[i] == marioArray[j]) {
					mutatedCourseArray[i] = -1;
				}
			}
		}
		for (int k = 0; k < largeLength; k++) {
			if (mutatedCourseArray[k] != -1) {
				outputArray[trackingIndex++] = mutatedCourseArray[k];
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String firstLine = myScanner.nextLine();
		String[] firstLineArray = firstLine.split(" ");
		int numObstacles = Integer.parseInt(firstLineArray[0]);
		int numFound = Integer.parseInt(firstLineArray[1]);

		if (numObstacles == 0) {
			System.out.print("Mario got " + numObstacles + " of the dangerous obstacles.");
		} else {
			int[] courseArray = populatesArray(numObstacles);
			int[] mariosArray = populatesArray(numFound, myScanner);
			int[] filteredMariosArray = removesDuplicates(mariosArray);
			int marioFoundThisNumObs = filteredMariosArray.length;
			int[] outputArray = comparesArray(courseArray, filteredMariosArray);
			for (int i = 0; i < outputArray.length; i++) {
				System.out.println(outputArray[i]);
			}
			System.out.print("Mario got " + marioFoundThisNumObs + " of the dangerous obstacles.");
		}
	}
}
