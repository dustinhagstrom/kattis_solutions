import java.util.Scanner;

public class Hanging {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int allowed = myScanner.nextInt();
		int events = myScanner.nextInt();
		int groupsDeniedEntry = 0;
		int patioPopulation = 0;

		for (int i = 0; i < events; i++){
			String movement = myScanner.next();
			int numInGroup = myScanner.nextInt();
			int newPopulation = patioPopulation + numInGroup;

			if (movement.equals("enter") && newPopulation <= allowed) {
				patioPopulation = newPopulation;
			} else if (movement.equals("leave")){
				patioPopulation -= numInGroup;
			} else {
				groupsDeniedEntry++;
			}
		}
		System.out.println(groupsDeniedEntry);
	}

}
