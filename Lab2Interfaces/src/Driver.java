import java.util.Scanner;

public class Driver {
	public final static void main(String [] args) {
		Scanner scranna = new Scanner(System.in);
		System.out.println("Boy howdy! Could you gimme a sentence to analyze?:");
		
		String userSentence = scranna.nextLine();
		WordProcessor wp1 = new WordProcessor();
		System.out.println("Alright, your sentence has " + wp1.countWords(userSentence) + " words...");
		System.out.println("..." + wp1.countLetters(userSentence) + " letters...");
		System.out.println("... and it is " + wp1.getLength(userSentence) + " characters long!");
	}
}
