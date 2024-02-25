import java.util.Scanner;

public class RatingProblems {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		float totalSum, numOfJudges, numJudgesDone, score, maxAvg, minAvg;
		totalSum = 0;
		
		numOfJudges = myScanner.nextFloat();
		numJudgesDone = myScanner.nextFloat();
		
		for (int i = 0; i < numJudgesDone; i++) {
			score = myScanner.nextFloat();
			totalSum += score;
		}
		maxAvg = (((numOfJudges - numJudgesDone) * 3) + totalSum) / numOfJudges;
		minAvg = (((numOfJudges - numJudgesDone) * -3) + totalSum) / numOfJudges;
		System.out.println(minAvg + " " + maxAvg);
	}

}
