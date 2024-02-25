// @author Dustin Hagstrom
// this program reads in a line of input using the Scanner class.
// this scanner object is then used to make a String that contains
// all of the user input. Then we use the split method of a string
// to make a dynamic array that contains all of the individual words of the
// user input. Then we can assign a word to a variable and search through
// the array for a match. If there is a match then we end the program and 
// output "no". if there is no match then we advance one index and look 
// for a match to this new word starting at the index to the right
// of this current word. if there is a match then output "no" and end the
// program. otherwise we continue on. If there are no matching then we 
// output "yes" and end the program.

import java.util.Scanner;

public class Nodup {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		 while(myScanner.hasNext()){
				String myLine = myScanner.nextLine();
				String [] stringArray =  myLine.split(" ");
				String currentWord;
				int lengthOfArray = stringArray.length;
				for (int i = 0; i < lengthOfArray; i++) {
					currentWord = stringArray[i].toLowerCase();
						for (int j = i + 1; j < lengthOfArray; j++) {
							String nextWord = stringArray[j].toLowerCase();
							if (currentWord.equals(nextWord)) {
								System.out.println("no");
								return;	
							}
					}
				}
				System.out.println("yes");
				return;
			}
		}
	 }

