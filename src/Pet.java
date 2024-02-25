import java.util.Scanner;

public class Pet {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int Player = 0;
		int highScore = 0;

		for (int i = 0; i < 5; i++) {
			int currentScore = 0;
			for (int j = 0; j < 4; j++) {
				int num = myScanner.nextInt();
				currentScore += num; 
			}
			if (currentScore > highScore) {
				highScore = currentScore;
				Player = i + 1;
			}
		}
		System.out.println(Player + " " + highScore);
	}

}
